package pk.group.pkreads.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pk.group.pkreads.entities.Messages;


@Repository
public interface MessageRepo extends JpaRepository<Messages, Long> {

}
