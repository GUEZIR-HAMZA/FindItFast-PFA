package pfa.project.finditfastbackend.Controller;


import jakarta.validation.Valid;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pfa.project.finditfastbackend.Model.User;
import pfa.project.finditfastbackend.Service.UserService;

import java.util.List;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    UserService userService;

//    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
//    public String login(){
//        return "auth/login";
//    }

//    @RequestMapping(value = {"/register"}, method = RequestMethod.GET)
//    public String register(Model model){
//        model.addAttribute("user", new User());
//        return "auth/register";
//    }
//
//    @RequestMapping(value = {"/register"}, method = RequestMethod.POST)
//    public String registerUser(Model model, @Valid User user, BindingResult bindingResult){
//        if(bindingResult.hasErrors()){
//            model.addAttribute("successMessage", "User registered successfully!");
//            model.addAttribute("bindingResult", bindingResult);
//            return "auth/register";
//        }
//        List<Object> userPresentObj = userService.isUserPresent(user);
//        if((Boolean) userPresentObj.get(0)){
//            model.addAttribute("successMessage", userPresentObj.get(1));
//            return "auth/register";
//        }
//
//        userService.saveUser(user);
//        model.addAttribute("successMessage", "User registered successfully!");
//
//        return "auth/login";
//    }
//    @PostMapping("/login")
//    public ResponseEntity<User> login(@RequestBody User user) {
//        User loginUser = userService.login(user.getUsername(), user.getPassword());
//        if(loginUser == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok().body(loginUser);
//    }

//    @PostMapping("/register")
//    public ResponseEntity<User> register(@RequestBody User user) {
//        User newUser = userService.register(user);
//        if(newUser == null) {
//            return ResponseEntity.status(HttpStatus.CONFLICT).build();
//        }
//        return ResponseEntity.ok().body(newUser);
//    }
//    @GetMapping("/login")
//    public String showLoginPage() {
//        return "auth/login";
//    }
//
//    @PostMapping("/login")
//    public String login(@RequestParam String username, @RequestParam String password, Model model) {
//        User user = userService.login(username, password);
//        if(user == null) {
//            model.addAttribute("error", "Invalid username or password"); // add error message to the model
//            return "login"; // return to login page with error message
//        }
//        // set user authentication and redirect to dashboard
//        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
//        SecurityContextHolder.getContext().setAuthentication(auth);
//        return "redirect:user/dashboard"; // redirect to dashboard after successful login
//    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        try {
            User savedUser = userService.register(user);
            return ResponseEntity.ok(savedUser);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        try {
            User authenticatedUser = userService.login(user.getUsername(), user.getPassword());
            return ResponseEntity.ok(authenticatedUser);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}