package tripservicekata.trip;


import tripservicekata.user.User;

import java.util.List;

public class TestTripDao implements Dao
{
  public List<Trip> findTripsByUser(User user)
  {
    return TripDAO.findTripsByUser(user);
  }
}
