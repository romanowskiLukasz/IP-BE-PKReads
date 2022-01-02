package pk.group.pkreads.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class RatingModel {
    private int stars_count;
    private Long book_book_id;
    private Long user_id;
}
