package pk.group.pkreads.model;

import lombok.*;
import pk.group.pkreads.types.BookStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserBooksStatusesModel {
    private  Long id;
    private String bookStatus;
    private Long book_book_id;
    private Long user_id;
    private String authorName;
    private String bookTitle;
}
