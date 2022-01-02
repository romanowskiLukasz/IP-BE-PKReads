package pk.group.pkreads.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ratings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "starsCount")
    private int starsCount;

    @ManyToOne
    private User user;

    @ManyToOne
    private Book book;



    public Rating(int starsCount ) {
        this.starsCount = starsCount;
    }

}
