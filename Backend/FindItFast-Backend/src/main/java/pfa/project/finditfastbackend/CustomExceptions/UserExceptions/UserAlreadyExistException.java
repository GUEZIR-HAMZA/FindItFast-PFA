package pfa.project.finditfastbackend.CustomExceptions.UserExceptions;

public class UserAlreadyExistException extends Exception {

    public UserAlreadyExistException(String message) {
        super(message);
    }
}