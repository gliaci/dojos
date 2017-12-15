package tripservicekata.trip;


import tripservicekata.exception.UserNotLoggedInException;
import tripservicekata.user.User;

import java.util.ArrayList;
import java.util.List;

public class TripService
{
  private Dao dao;

  public TripService(Dao dao)
  {
    this.dao = dao;
  }

  public List<Trip> getTripsByUser(User user, User loggedUser) throws UserNotLoggedInException
  {
    validate(loggedUser);
    return user.isFriend(loggedUser) ? dao.findTripsByUser(user) : new ArrayList<Trip>();
  }

  private void validate(User loggedUser)
  {
    if (loggedUser == null)
    {
      throw new UserNotLoggedInException();
    }
  }

}
