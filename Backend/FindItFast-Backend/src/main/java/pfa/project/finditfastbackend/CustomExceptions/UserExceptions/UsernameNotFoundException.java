package pfa.project.finditfastbackend.CustomExceptions.UserExceptions;

public class UsernameNotFoundException extends AuthenticationException {

    public UsernameNotFoundException(String message) {
        super(message);
    }
}