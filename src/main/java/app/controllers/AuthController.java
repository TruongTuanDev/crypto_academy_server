package app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.request.SignInForm;
import app.dto.request.SignUpForm;
import app.dto.response.EntityResponse;
import app.dto.response.JwtResponse;
import app.models.Role;
import app.services.IRoleService;
import app.services.IUserService;
import app.services.impl.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("api/auth/v1/users")
public class AuthController {
    @Autowired
    private IUserService iUserService;
    @Autowired
    private AuthenticationManager authenticationManager;
 
    @Autowired
    private UserService userService;
  


  // @PostMapping(path = "/register")
  //  public ResponseEntity<?> register(@RequestBody SignUpForm signUpForm, BindingResult bindingResult)
  //   {
  //       System.out.println("Saving employee");
  //       if (bindingResult.hasErrors()) {
  //         return EntityResponse.generateResponse("Tạo người dùng thất bại", HttpStatus.BAD_REQUEST, "Không có dữ liệu");
  //       }
  //       return EntityResponse.generateResponse("Created user successfully",HttpStatus.CREATED,userService.createUser(signUpForm, Role.ROLE_CUSTOMER));
  //   }
  @PostMapping(path = "/register")
  public ResponseEntity<?> register(@RequestBody SignUpForm signUpForm, BindingResult bindingResult)
   {
       System.out.println("Saving employee");
       if (bindingResult.hasErrors()) {
         return EntityResponse.generateResponse("Tạo người dùng thất bại", HttpStatus.BAD_REQUEST, "Không có dữ liệu");
       }
       return EntityResponse.generateResponse("Created user successfully",HttpStatus.CREATED,userService.createUser(signUpForm, Role.ROLE_CUSTOMER));
   }
    // @PostMapping(path = "/login")
    //  public ResponseEntity<?> login( @RequestBody SignInForm signInForm) {
    //     Authentication authentication = authenticationManager.authenticate(
    //             new UsernamePasswordAuthenticationToken(signInForm.getPhoneNumber(), signInForm.getPassword()));
    //     SecurityContextHolder.getContext().setAuthentication(authentication);
    //     String token = jwtProvider.createToken(authentication);
    //     UserPrinciple userPrinciple = (UserPrinciple) authentication.getPrincipal();
    //     return ResponseEntity.ok(new JwtResponse(
    //               token,
    //               userPrinciple.getId(),
    //               userPrinciple.getFullName(),
    //               userPrinciple.getPassword(),
    //               userPrinciple.getPhone(),
    //               userPrinciple.getIdCountry(),
    //               userPrinciple.getEmail(),
    //               userPrinciple.getAddress(),
    //               userPrinciple.getSex(),
    //               userPrinciple.getDateOfBirth(),
    //               userPrinciple.getAvatar(),
    //               userPrinciple.getAuthorities()));
    // }
  
}
