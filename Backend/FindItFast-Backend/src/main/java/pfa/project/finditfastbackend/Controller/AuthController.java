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

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody User user) throws UserAlreadyExistException {
        if (userService.register(user)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestParam("email") String email, @RequestParam("password") String password) throws AuthenticationException {
        if (userService.login(email, password)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
