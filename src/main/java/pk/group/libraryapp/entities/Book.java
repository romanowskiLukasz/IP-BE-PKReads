package pk.group.libraryapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long book_id;

    @Column(name = "title")
    private String title;

    @Column(name = "genre")
    private String genre;

    @Column(name = "description")
    @Lob
    private String description;

    @Column(name = "img")
    private String img;


    @ManyToOne
    private PublishingHouse publishingHouse;

    @OneToMany(mappedBy="book")
    private Set<Rating> rating;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "book_author",
            joinColumns = { @JoinColumn(name = "book_id") },
            inverseJoinColumns = { @JoinColumn(name = "author_id") })
    private List<Author> authors;

    @OneToMany(mappedBy = "book")
    private Set<Reservation> reservations;




    public Book(String title, String genre, String description ) {
        this.title = title;
        this.genre = genre;
        this.description = description;
    }

    public Book(String title, String genre, String description, String img) {
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.img = img;
    }
}
