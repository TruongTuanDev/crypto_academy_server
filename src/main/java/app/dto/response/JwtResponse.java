package app.dto.response;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
  String token;
  private String type = "Bearer";
      private Long id;
    private String fullName;

    private String password;

    private String phone;

    private String idCountry;

    private String email;

    private String address;

    private String sex;

    private String dateOfBirth;

    private String avatar;

    private Collection<? extends GrantedAuthority> roles;

    public JwtResponse(String token, Long id, String fullName, String password, String phone, String idCountry,
        String email, String address, String sex, String dateOfBirth, String avatar,
        Collection<? extends GrantedAuthority> roles) {
      this.token = token;
      this.id = id;
      this.fullName = fullName;
      this.password = password;
      this.phone = phone;
      this.idCountry = idCountry;
      this.email = email;
      this.address = address;
      this.sex = sex;
      this.dateOfBirth = dateOfBirth;
      this.avatar = avatar;
      this.roles = roles;
    }


}
