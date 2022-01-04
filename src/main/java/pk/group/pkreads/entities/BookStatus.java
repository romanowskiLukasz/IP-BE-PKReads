package pk.group.pkreads.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "book_status")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_status")
    private String bookStatus;

    @ManyToOne
    private User user;

    @ManyToOne
    private Book book;



    public BookStatus(String bookStatus ) {
        this.bookStatus = bookStatus;
    }

}
