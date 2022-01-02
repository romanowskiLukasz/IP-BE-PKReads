package pk.group.pkreads.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pk.group.pkreads.entities.Form;


@Repository
public interface FormRepo extends JpaRepository<Form, Long> {

}
