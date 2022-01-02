package pk.group.pkreads.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AvgRatingModel {
    private Double stars_count;
    private Long book_book_id;
}
