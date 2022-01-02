package pk.group.pkreads.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pk.group.pkreads.entities.Rating;
import pk.group.pkreads.model.AvgRatingModel;
import pk.group.pkreads.model.RatingModel;

import java.util.List;

@Repository
public interface RatingRepo extends JpaRepository<Rating, Long> {

    @Query("SELECT new pk.group.pkreads.model.RatingModel(r.starsCount,r.book.book_id,r.user.id) from Rating r where r.user.id=:id")
    public List<RatingModel> getInfoById(Long id);

    @Query("SELECT new pk.group.pkreads.model.AvgRatingModel(avg(r.starsCount),r.book.book_id) from Rating r where r.book.book_id=:id")
    public AvgRatingModel getAvgBookRating(Long id);
}
