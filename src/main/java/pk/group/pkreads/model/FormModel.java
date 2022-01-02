package pk.group.pkreads.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FormModel {

    private String title;
    private String author;
    private String publishingHouse;
    private Long userId;
}
