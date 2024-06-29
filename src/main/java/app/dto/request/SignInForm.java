package app.dto.request;

// import javax.validation.constraints.Pattern;
// import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SignInForm {
    // @Size(min = 9,max = 12,message = "Số điện thoại không đúng định dạng")
    private String phoneNumber;
    // @Pattern(regexp = "^[a-zA-Z0-9]+$",message = "Mật khẩu không đúng định dạng")
    // @Size(min = 5,max = 10, message = "Mật khẩu không đúng định dạng")
    private String password;
}