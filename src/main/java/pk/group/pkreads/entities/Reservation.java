package pk.group.pkreads.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservations")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reservation {

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

    public Reservation( User user, Book book,LocalDate reservationDate,LocalDate returnDate) {
        this.user = user;
        this.book = book;
        this.reservationDate=reservationDate;
        this.returnDate=returnDate;
    }
}