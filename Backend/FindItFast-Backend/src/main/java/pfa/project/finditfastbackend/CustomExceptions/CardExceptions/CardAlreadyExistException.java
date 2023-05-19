package pfa.project.finditfastbackend.CustomExceptions.CardExceptions;

public class CardAlreadyExistException extends Exception {

    public CardAlreadyExistException(String message) {
        super(message);
    }
}