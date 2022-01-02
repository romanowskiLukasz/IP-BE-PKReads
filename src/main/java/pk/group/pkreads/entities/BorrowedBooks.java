package pk.group.pkreads.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "borrowed_books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BorrowedBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reservationDate")
    private LocalDate reservationDate;

    @Column(name = "returnDate")
    private LocalDate returnDate;


    @ManyToOne
    @JsonIgnore
    private User user;

    @ManyToOne
    private Book book;

    public BorrowedBooks( User user, Book book,LocalDate reservationDate,LocalDate returnDate) {
        this.user = user;
        this.book = book;
        this.reservationDate=reservationDate;
        this.returnDate=returnDate;
    }
}