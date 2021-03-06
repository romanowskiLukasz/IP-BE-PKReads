package pk.group.pkreads.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CommentsModel {
    private Long id;
    private String content;
    private Long book_book_id;
    private Long user_id;
    private String user_name;
}
