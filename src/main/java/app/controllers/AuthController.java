package app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.request.SignUpForm;
import app.dto.response.EntityResponse;
import app.models.Role;
import app.services.impl.UserService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/users")
public class AuthController {

  @Autowired
  private UserService userService;
  


@PostMapping(path = "/register")
   public ResponseEntity<?> register(@RequestBody SignUpForm signUpForm, BindingResult bindingResult)
    {
        System.out.println("Saving employee");
        if (bindingResult.hasErrors()) {
          return EntityResponse.generateResponse("Tạo người dùng thất bại", HttpStatus.BAD_REQUEST, "Không có dữ liệu");
        }
        return EntityResponse.generateResponse("Created user successfully",HttpStatus.CREATED,userService.createUser(signUpForm, Role.ROLE_CUSTOMER));
    }
  
}
