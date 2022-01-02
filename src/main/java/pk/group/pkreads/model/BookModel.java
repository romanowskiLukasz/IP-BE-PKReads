package pk.group.pkreads.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookModel {

    private Long book_id;
    private String title;
    private String genre;
    private String img;
    private String description;
    private String name;
    private String publishingHouse;
}
