package pfa.project.finditfastbackend.Service.user;


import pfa.project.finditfastbackend.Model.User;

import java.util.List;

public interface UserService {
    void register(User user);
    boolean login(String email, String password);

    List<User> getAllUsers();
}
