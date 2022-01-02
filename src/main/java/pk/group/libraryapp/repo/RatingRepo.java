package pk.group.libraryapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pk.group.libraryapp.entities.PublishingHouse;
import pk.group.libraryapp.entities.Rating;
import pk.group.libraryapp.model.AvgRatingModel;
import pk.group.libraryapp.model.BookModel;
import pk.group.libraryapp.model.RatingModel;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface RatingRepo extends JpaRepository<Rating, Long> {

    @Query("SELECT new pk.group.libraryapp.model.RatingModel(r.starsCount,r.book.book_id,r.user.id) from Rating r where r.user.id=:id")
    public List<RatingModel> getInfoById(Long id);

    @Query("SELECT new pk.group.libraryapp.model.AvgRatingModel(avg(r.starsCount),r.book.book_id) from Rating r where r.book.book_id=:id")
    public AvgRatingModel getAvgBookRating(Long id);
}
