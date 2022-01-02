package pk.group.pkreads.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pk.group.pkreads.entities.Comments;
import pk.group.pkreads.entities.Rating;
import pk.group.pkreads.model.AvgRatingModel;
import pk.group.pkreads.model.CommentsModel;
import pk.group.pkreads.model.RatingModel;
import pk.group.pkreads.model.UserBorrowModel;

import java.util.List;

@Repository
public interface CommentsRepo extends JpaRepository<Comments, Long> {

    @Query("SELECT new pk.group.pkreads.model.CommentsModel(c.content,c.book.book_id,c.user.id,c.user.name) from Comments c where c.book.book_id=:bookId")
    List<CommentsModel> getComments(Long bookId);
}

