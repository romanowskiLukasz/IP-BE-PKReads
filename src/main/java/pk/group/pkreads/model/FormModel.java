package pk.group.pkreads.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FormModel {

    private long id;
    private String description;
    private String img;
    private String title;
    private String author;
    private String publishingHouse;
    private Long userId;
}
