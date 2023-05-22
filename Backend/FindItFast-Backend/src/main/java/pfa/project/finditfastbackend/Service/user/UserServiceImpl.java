package pfa.project.finditfastbackend.Service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfa.project.finditfastbackend.Model.User;
import pfa.project.finditfastbackend.Repository.UserRepository;
import pfa.project.finditfastbackend.CustomExceptions.UserExceptions.AuthenticationException;
import pfa.project.finditfastbackend.CustomExceptions.UserExceptions.UserAlreadyExistException;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void register(User user){
        userRepository.save(user);
    }

    @Override
    public boolean login(String email, String password){
        User user = userRepository.findByEmail(email, password);
        if(user != null){
            return true;
        }
        return false;
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}