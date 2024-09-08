package app.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import app.models.Role;

@Service
public interface IRoleService {

  Optional<Role> roleAdmin();

  Optional<Role> roleCustomer();

  Optional<Role> roleEmployee();
  
}