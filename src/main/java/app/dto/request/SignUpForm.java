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

    private String confirmPassword;

    private String phoneNumber;

    private String idCountry;

    private String email;

    private String address;

    private String sex;

    private String dateOfBirth;

    private String avatar;

    private Role roles;

    public void validate(List<User> list, SignUpForm signUpForm, Errors errors){
      for (User user : list) {
          if (Objects.equals(user.getPhone(), signUpForm.getPhoneNumber())) {
              errors.rejectValue("phoneNumber", "phoneNumber", "Số điện thoại " + signUpForm.getPhoneNumber() + " đã được sử dụng");
          }

      }
      if (!Objects.equals(signUpForm.getPassword(), signUpForm.getConfirmPassword())) {
          errors.rejectValue("confirmPassword", "confirmPassword", "Mật khẩu xác nhận không trùng khớp ");

      }
  }
  }

