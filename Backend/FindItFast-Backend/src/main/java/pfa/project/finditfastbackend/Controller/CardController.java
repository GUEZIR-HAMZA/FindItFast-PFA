package pfa.project.finditfastbackend.Controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfa.project.finditfastbackend.Model.DigitalCard;
import pfa.project.finditfastbackend.Service.digitalcard.DigitalCardService;
import pfa.project.finditfastbackend.CustomExceptions.CardExceptions.CardAlreadyExistException;

@RestController
@RequestMapping("/api/cards")
public class CardController {

    private final DigitalCardService digitalCardService;

    public CardController(DigitalCardService digitalCardService) {
        this.digitalCardService = digitalCardService;
    }

    @PostMapping("/all")
    public ResponseEntity<?> getAllCards() throws CardAlreadyExistException{
        return ResponseEntity.ok(digitalCardService.getAllDigitalCards());
    }


    @PostMapping("/add")
    public ResponseEntity<?> addCard(@Valid @RequestBody DigitalCard Card) throws CardAlreadyExistException {
        if (digitalCardService.addDigitalCard(Card)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    @PostMapping("/update")
    public ResponseEntity<?> updateCard(@Valid @RequestBody DigitalCard Card) throws CardAlreadyExistException {
        if (digitalCardService.updateDigitalCard(Card)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    @PostMapping("/delete")
    public ResponseEntity<?> deleteCard(@Valid @RequestBody DigitalCard Card) throws CardAlreadyExistException {
        if (digitalCardService.deleteDigitalCard(Card)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}
