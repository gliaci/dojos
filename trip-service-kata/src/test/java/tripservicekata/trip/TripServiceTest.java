package tripservicekata.trip;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import tripservicekata.exception.UserNotLoggedInException;
import tripservicekata.user.User;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TripServiceTest
{
  public static final Trip ANY_TRIP = new Trip();
  @Mock
  private Dao dao;

  @Test(expected = UserNotLoggedInException.class)
  public void whenUserIsNotLogged() throws Exception
  {
    final TripService tripService = new TripService(dao);
    List<Trip> tripsByUser = tripService.getTripsByUser(newUser(), null);
  }

  @Test
  public void whenUserIsLoggedAndAndSearchUserHasNoFriends() throws Exception
  {
    User loggedUser = newUser();
    User searchUser = newUser();
    final TripService tripService = new TripService(dao);
    List<Trip> tripsByUser = tripService.getTripsByUser(searchUser, loggedUser);
    assertThat(tripsByUser.size(), is(0));
  }

  @Test
  public void whenUserIsLoggedAndSearchUserFriendsNotContainsLoggedUser() throws Exception
  {
    User loggedUser = newUser();
    User searchUser = newUser();
    searchUser.addFriend(newUser());
    final TripService tripService = new TripService(dao);
    List<Trip> tripsByUser = tripService.getTripsByUser(searchUser, loggedUser);
    verify(dao, never()).findTripsByUser(any(User.class));
    assertThat(tripsByUser.size(), is(0));
  }

  @Test
  public void whenUserIsLoggedAndSearchUserFriendsContainsLoggedUser() throws Exception
  {
    when(dao.findTripsByUser(any(User.class))).thenReturn(Arrays.asList(ANY_TRIP));
    User loggedUser = newUser();
    User searchUser = newUser();
    searchUser.addFriend(loggedUser);
    final TripService tripService = new TripService(dao);
    List<Trip> tripsByUser = tripService.getTripsByUser(searchUser, loggedUser);
    verify(dao, times(1)).findTripsByUser(any(User.class));
    assertThat(tripsByUser.size(), is(1));
  }

  private User newUser()
  {
    return new User();
  }
}
