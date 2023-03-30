package pfa.project.finditfastbackend.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CustomErrorResponse {
    private String message;

    public CustomErrorResponse(HttpStatus status, String message) {
        this.message = message;
        throw new ResponseStatusException(status, message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
