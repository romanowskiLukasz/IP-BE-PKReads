package pk.group.pkreads.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "publishingHouse")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PublishingHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "adress")
    private String adress;

    @OneToMany(mappedBy = "publishingHouse")
    @JsonIgnore
    private List<Book> Book;

    public PublishingHouse(String name, String adress) {
        this.name=name;
        this.adress=adress;
    }
}
