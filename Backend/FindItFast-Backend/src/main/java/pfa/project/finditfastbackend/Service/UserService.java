package pfa.project.finditfastbackend.Service;


import pfa.project.finditfastbackend.Model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);
    List<Object> isUserPresent(User user);
}
