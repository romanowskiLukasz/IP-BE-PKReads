package pk.group.cinemasbapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pk.group.cinemasbapp.model.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long> {

}
