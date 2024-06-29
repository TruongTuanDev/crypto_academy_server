package app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import app.models.User;

@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
  Optional<User> findOneByPhoneAndPassword(String phoneNumber, String password);
  User findByPhone(String phoneNumber);
}