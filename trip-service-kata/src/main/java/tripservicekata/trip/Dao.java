package tripservicekata.trip;

import tripservicekata.user.User;

import java.util.List;

public interface Dao
{
  List<Trip> findTripsByUser(User user);
}
