package app.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import app.dto.request.SignUpForm;
import app.models.Role;
import app.models.User;
import java.util.Optional;
import java.util.List;


@Service
@Component
public interface IUserService {

    User findById(int id);

    Optional<User> findByUsername(String username);

    void changePassword(String password,String username);

    User createUser(SignUpForm user, Role role);

    Boolean existsByEmail(String email);
    Boolean existsByPhoneNumber(String number);


    List<User> findAll();

}
