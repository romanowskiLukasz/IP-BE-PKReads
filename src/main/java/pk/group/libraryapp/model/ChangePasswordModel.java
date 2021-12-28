package pk.group.libraryapp.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ChangePasswordModel {
    private Long id;
    private String password;
    private String newPassword;
}
