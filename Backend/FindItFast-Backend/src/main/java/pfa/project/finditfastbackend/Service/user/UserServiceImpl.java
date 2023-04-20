package pfa.project.finditfastbackend.Service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfa.project.finditfastbackend.Model.User;
import pfa.project.finditfastbackend.Repository.UserRepository;
import pfa.project.finditfastbackend.CustomExceptions.UserExceptions.AuthenticationException;
import pfa.project.finditfastbackend.CustomExceptions.UserExceptions.UserAlreadyExistException;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean register(User user) throws UserAlreadyExistException {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new UserAlreadyExistException("Email already exists: " + user.getEmail());
        }
        userRepository.save(user);
        return true;
    }

    @Override
    public boolean login(String email, String password) throws AuthenticationException {
        Optional<User> userOptional = userRepository.findByEmail(email);
        if (!userOptional.isPresent()) {
            throw new AuthenticationException("Invalid email or password");
        }
        User user = userOptional.get();
        if (!user.getPassword().equals(password)) {
            throw new AuthenticationException("Invalid email or password");
        }
        return true;
    }
}