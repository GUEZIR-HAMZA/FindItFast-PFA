package pfa.project.finditfastbackend.Controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfa.project.finditfastbackend.Model.User;
import pfa.project.finditfastbackend.Service.user.UserService;
import pfa.project.finditfastbackend.CustomExceptions.UserExceptions.AuthenticationException;
import pfa.project.finditfastbackend.CustomExceptions.UserExceptions.UserAlreadyExistException;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void registerUser(@Valid @RequestBody User user){
        userService.register(user);
    }

    @PostMapping("/login")
    public boolean loginUser(@RequestParam("email") String email, @RequestParam("password") String password){
        return userService.login(email, password);
    }
}
