package pfa.project.finditfastbackend.Controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pfa.project.finditfastbackend.Model.DigitalCard;
import pfa.project.finditfastbackend.Service.digitalcard.DigitalCardService;
import pfa.project.finditfastbackend.CustomExceptions.CardExceptions.CardAlreadyExistException;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
public class CardController {

    @Autowired
    private DigitalCardService digitalCardService;

    @PostMapping("/all")
    public List<DigitalCard> getAllCards(){
        return digitalCardService.getAllDigitalCards();
    }


    @PostMapping("/add")
    public void addCard(@Valid @RequestBody DigitalCard Card){
        digitalCardService.addDigitalCard(Card);
    }

    @PostMapping("/update")
    public void updateCard(@Valid @RequestBody DigitalCard Card){
        digitalCardService.updateDigitalCard(Card);
    }

    @PostMapping("/delete")
    public void deleteCard(@Valid @RequestBody DigitalCard Card){
        digitalCardService.deleteDigitalCard(Card);
    }
}
