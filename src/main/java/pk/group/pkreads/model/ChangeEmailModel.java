package pk.group.pkreads.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ChangeEmailModel {
    private Long id;
    private String password;
    private String newEmail;
}
