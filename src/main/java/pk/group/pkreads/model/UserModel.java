package pk.group.pkreads.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserModel {
    Long id;
    String name;
    String email;
}