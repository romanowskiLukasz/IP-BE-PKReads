package pk.group.pkreads.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pk.group.pkreads.entities.BookStatus;
import pk.group.pkreads.entities.Rating;
import pk.group.pkreads.model.AvgRatingModel;
import pk.group.pkreads.model.BookStatusModel;
import pk.group.pkreads.model.RatingModel;
import pk.group.pkreads.model.UserBooksStatusesModel;

import java.util.List;

@Repository
public interface BookStatusRepo extends JpaRepository<BookStatus, Long> {


    @Query("SELECT new pk.group.pkreads.model.BookStatusModel(b.id,b.bookStatus,b.book.book_id,b.user.id) from BookStatus b where b.book.book_id=:bookId and b.user.id=:userId")
    public BookStatusModel getBookStatus(Long bookId,Long userId);

    @Query("SELECT new pk.group.pkreads.model.UserBooksStatusesModel(s.id,s.bookStatus,s.book.book_id,s.user.id,a.name,b.title) from BookStatus s join s.book b join b.authors a where s.user.id=:userId")
    public List<UserBooksStatusesModel> getBookStatusByUserId(Long userId);


}
