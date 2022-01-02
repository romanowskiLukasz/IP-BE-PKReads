package pk.group.pkreads.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserReservationsModel {
    String title;
    String name;
    LocalDate reservation_date;
    LocalDate return_date;
}