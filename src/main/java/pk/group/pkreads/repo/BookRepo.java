package pk.group.pkreads.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pk.group.pkreads.entities.Book;
import pk.group.pkreads.model.BookModel;
import pk.group.pkreads.model.PopularBookModel;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

    @Query("SELECT new pk.group.pkreads.model.BookModel(b.book_id,b.title,b.genre,b.img,b.description,a.name,p.name) from Book b join  b.authors a  join b.publishingHouse p")
    public List<BookModel> getBooksInfo();

    @Query("SELECT new pk.group.pkreads.model.PopularBookModel(b.book_id,b.title,b.genre,b.img,b.description,a.name,p.name,count(b.title)) from Book b join  b.authors a  join b.publishingHouse p join b.rating group by b.book_id order by count(b.title) desc ")
    public List<PopularBookModel> getPopularBooksInfo();

    @Query("SELECT new pk.group.pkreads.model.BookModel(b.book_id,b.title,b.genre,b.img,b.description,a.name,p.name) from Book b join  b.authors a  join b.publishingHouse p where b.book_id=:id")
    public BookModel getInfoById(Long id);



}
