package pk.group.pkreads.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pk.group.pkreads.entities.PublishingHouse;

@Repository
public interface PublishingHouseRepo extends JpaRepository<PublishingHouse, Long> {
}
