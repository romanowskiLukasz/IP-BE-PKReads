package pk.group.pkreads.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Messages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "topic")
    private String topic;

    @Column(name = "contents")
    private String contents;


    public Messages(String email,String topic,String contents) {
        this.email=email;
        this.topic=topic;
        this.contents=contents;
    }
}
