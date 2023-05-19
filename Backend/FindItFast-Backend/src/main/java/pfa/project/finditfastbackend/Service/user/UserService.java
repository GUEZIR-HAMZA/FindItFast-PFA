package pfa.project.finditfastbackend.Service.user;


import pfa.project.finditfastbackend.Model.User;
import pfa.project.finditfastbackend.CustomExceptions.UserExceptions.AuthenticationException;
import pfa.project.finditfastbackend.CustomExceptions.UserExceptions.UserAlreadyExistException;

public interface UserService {
    boolean register(User user) throws UserAlreadyExistException;
    boolean login(String email, String password) throws AuthenticationException;
}
