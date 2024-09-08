package app.dto.request;

import java.util.List;
import java.util.Objects;


import org.springframework.validation.Errors;

import app.models.Role;
import app.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SignUpForm {
    private String fullName;

    private String password;

    private String rePassword;
 
    private String phone;

    private String idCountry;

    public void validate(List<User> list, SignUpForm signUpForm, Errors errors){
      for (User user : list) {
          if (Objects.equals(user.getPhone(), signUpForm.getPhone())) {
              errors.rejectValue("phone", "error.phone.exists", "Số điện thoại " + signUpForm.getPhone() + " đã được sử dụng");
          }

      }
      if (!Objects.equals(signUpForm.getPassword(), signUpForm.getRePassword())) {
          errors.rejectValue("rePassword", "error.password.mismatch", "Mật khẩu xác nhận không trùng khớp ");

      }
  }
  }

