package pk.group.pkreads.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "form")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "publishingHouse")
    private String publishingHouse;

    @ManyToOne
    private User user;

    public Form(String title,String author,String publishingHouse) {
        this.title = title;
        this.author=author;
        this.publishingHouse=publishingHouse;
    }
}
