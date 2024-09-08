package app.models;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name", nullable = true)
    private String fullName;

    @Column(name = "password", nullable = true)
    private String password;

    @Column(name = "phone", nullable = true)
    private String phone;

    @Column(name = "id_country", nullable = true)
    private String idCountry;

    @Column(name = "email", nullable = true)
    private String email;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(name = "sex", nullable = true)
    private String sex;

    @Column(name = "date", nullable = true)
    private String dateOfBirth;

    @Column(name = "avatar", nullable = true)
    private String avatar;

    @Column(name = "role", nullable = false)
    private Role roles;

    public User(String fullName, String password, String phoneNumber, String idCountry, Role roles) {
        this.fullName = fullName;
        this.password = password;
        this.phone = phoneNumber;
        this.idCountry = idCountry;
        this.roles = roles;
    }

    
}