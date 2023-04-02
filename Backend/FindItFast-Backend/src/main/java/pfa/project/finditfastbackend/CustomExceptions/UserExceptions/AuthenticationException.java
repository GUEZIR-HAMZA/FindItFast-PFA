package pfa.project.finditfastbackend.CustomExceptions.UserExceptions;

public class AuthenticationException extends Exception {

    public AuthenticationException(String message) {
        super(message);
    }
}
