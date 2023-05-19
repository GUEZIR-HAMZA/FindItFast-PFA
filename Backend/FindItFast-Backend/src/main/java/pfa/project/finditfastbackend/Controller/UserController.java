package pfa.project.finditfastbackend.Controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pfa.project.finditfastbackend.Model.User;
import pfa.project.finditfastbackend.Service.user.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}