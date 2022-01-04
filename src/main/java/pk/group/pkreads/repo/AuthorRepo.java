package pk.group.pkreads.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pk.group.pkreads.entities.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Long> {



}
