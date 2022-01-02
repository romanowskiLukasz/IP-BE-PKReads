package pk.group.pkreads.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pk.group.pkreads.entities.PublishingHouse;

@Repository
public interface PublishingHouseRepo extends JpaRepository<PublishingHouse, Long> {
    /*List<PublishingHouse> findSeancesByDate(LocalDate date);
    Optional<PublishingHouse> findById(Long id);
    Optional<PublishingHouse> findByFilm_IdAndDateAndTime(Long filmId, LocalDate date, LocalTime time);
*/
    //@Query(value = "SELECT * FROM people WHERE people.name LIKE :pattern", nativeQuery = true)
    //List<Seance> findPeopleWithNameStartingWith(@Param("pattern") String pattern);
}
