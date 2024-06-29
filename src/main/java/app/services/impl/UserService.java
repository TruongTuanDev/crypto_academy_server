package app.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import app.dto.request.SignUpForm;
import app.models.Role;
import app.models.User;
import app.repositories.UserRepository;
import app.services.IUserService;
import jakarta.transaction.Transactional;

@Service
public class UserService implements IUserService{

  
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public User findById(int id) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
    @Override
    public Optional<User> findByUsername(String username) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'findByUsername'");
    }
    @Override
    public void changePassword(String password, String username) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'changePassword'");
    }
    @Override
    public User createUser(SignUpForm userResquest, Role role) {
      User user = User.builder()
      .fullName(userResquest.getFullName())
      .phone(userResquest.getPhoneNumber())
      .password(userResquest.getPassword())
      .idCountry(userResquest.getIdCountry())
      .roles(role)
      .build();
      return userRepository.save(user);
    }
    @Override
    public Boolean existsByEmail(String email) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'existsByEmail'");
    }
    @Override
    public Boolean existsByPhoneNumber(String number) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'existsByPhoneNumber'");
    }
    @Override
    public List<User> findAll() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
  
}
