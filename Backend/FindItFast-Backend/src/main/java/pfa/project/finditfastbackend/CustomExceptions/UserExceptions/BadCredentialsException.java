package pfa.project.finditfastbackend.CustomExceptions.UserExceptions;

public class BadCredentialsException extends AuthenticationException {

    public BadCredentialsException(String message) {
        super(message);
    }
}