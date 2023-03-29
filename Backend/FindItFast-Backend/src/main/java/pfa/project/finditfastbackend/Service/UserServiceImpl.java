package pfa.project.finditfastbackend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pfa.project.finditfastbackend.Model.User;
import pfa.project.finditfastbackend.Repository.UserRepository;


import java.util.Optional;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
//    @Autowired
//    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    UserRepository userRepository;

//    @Override
//    public void saveUser(User user) {
//        String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
//        user.setPassword(encodedPassword);
////        user.setRole(Role.USER);
//        userRepository.save(user);
//    }

    @Override
    public boolean isUserPresent(String emailOrMobile) {
//        boolean userExists = false;
//        String message = null;
//        Optional<User> existingUserEmail = userRepository.findByEmail(user.getEmail());
//        if(existingUserEmail.isPresent()){
//            userExists = true;
//            message = "Email Already Present!";
//        }
//        Optional<User> existingUserMobile = userRepository.findByMobile(user.getMobile());
//        if(existingUserMobile.isPresent()){
//            userExists = true;
//            message = "Mobile Number Already Exist!";
//        }
//        if (existingUserEmail.isPresent() && existingUserMobile.isPresent()) {
//            message = "Email and Mobile Number Both Already Exist!";
//        }
//        System.out.println("existingUserEmail.isPresent() - "+existingUserEmail.isPresent()+"existingUserMobile.isPresent() - "+existingUserMobile.isPresent());
//        return Arrays.asList(userExists, message);
        Optional<User> existingUserEmail = userRepository.findByEmail(emailOrMobile);
        if (existingUserEmail.isPresent()) {
            return true;
        }
        Optional<User> existingUserMobile = userRepository.findByMobile(emailOrMobile);
        if (existingUserMobile.isPresent()) {
            return true;
        }
        return false;
    }

    @Override
    public User login(String username, String password) throws Exception {
//        Optional<User> user = userRepository.findByEmail(username);
//        if(user.isPresent()){
//            if(password.equals(user.get().getPassword())){
//                return user.get();
//            }
//        }
//        return null;
        User user = userRepository.findByUsernameAndPassword(username, password);
        if (user == null) {
            throw new Exception("Invalid username or password");
        }
        return user;
    }

    @Override
    public User register(User user) throws Exception {
        // check if user already exists
//        List<Object> userPresentObj = isUserPresent(user);
//        if((Boolean) userPresentObj.get(0)){
//            return null;
//        }
//
//        // save user
//        return userRepository.save(user);
        if (isUserPresent(user.getUsername())) {
            throw new Exception("Username already exists");
        }
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public boolean updateInfoUser(User user) {
        return false;
    }

    @Override
    public boolean CreateCard(User user, String cardNumber) {
        return false;
    }

    @Override
    public boolean DeleteCard(User user, String cardNumber) {
        return false;
    }

    @Override
    public boolean UpdateCard(User user, String cardNumber) {
        return false;
    }

    @Override
    public boolean UpdatePassword(User user, String password) {
        return false;
    }

    @Override
    public boolean UpdateEmail(User user, String email) {
        return false;
    }

    @Override
    public String GenerateCardLink(User user, String cardNumber) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email).orElseThrow(
                ()-> new UsernameNotFoundException(
                        String.format("USER_NOT_FOUND", email)
                ));
    }
}
