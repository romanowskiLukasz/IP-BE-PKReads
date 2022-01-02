package pk.group.pkreads.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pk.group.pkreads.entities.Reservation;
import pk.group.pkreads.model.UserReservationsModel;

import java.util.List;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Long> {

    @Query("SELECT new pk.group.pkreads.model.UserReservationsModel(b.title,a.name,r.reservationDate,r.returnDate) from Reservation r join r.book b join  b.authors a   where r.user.id=:userId")
    List<UserReservationsModel> getUserReservations(Long userId);


}
