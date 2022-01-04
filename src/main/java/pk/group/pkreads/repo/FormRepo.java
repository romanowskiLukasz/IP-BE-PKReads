package pk.group.pkreads.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pk.group.pkreads.entities.Form;
import pk.group.pkreads.model.AvgRatingModel;
import pk.group.pkreads.model.FormModel;

import java.util.List;


@Repository
public interface FormRepo extends JpaRepository<Form, Long> {

    @Query("SELECT new pk.group.pkreads.model.FormModel(f.id,f.description,f.img,f.title,f.author,f.publishingHouse,f.user.id) from Form f  ")
    public List<FormModel> getAllForms();
}
