package pfa.project.finditfastbackend.Service;


import org.springframework.stereotype.Service;
import pfa.project.finditfastbackend.Model.User;

import java.util.List;

public interface UserService {

//    void saveUser(User user);
    boolean isUserPresent(String emailOrMobile);

    User login(String username, String password) throws Exception;

    User register(User user) throws Exception;

    void deleteUser(Long id);

    boolean updateInfoUser(User user);

    boolean CreateCard(User user, String cardNumber);

    boolean DeleteCard(User user, String cardNumber);

    boolean UpdateCard(User user, String cardNumber);

    boolean UpdatePassword(User user, String password);

    boolean UpdateEmail(User user, String email);

    String GenerateCardLink(User user, String cardNumber);

//  String GenerateCardQR(User user, String cardNumber);











}
