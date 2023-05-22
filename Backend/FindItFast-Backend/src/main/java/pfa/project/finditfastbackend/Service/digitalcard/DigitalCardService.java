package pfa.project.finditfastbackend.Service.digitalcard;

import pfa.project.finditfastbackend.Model.DigitalCard;

import java.util.List;

public interface DigitalCardService {

    void addDigitalCard(DigitalCard digitalCard);
    void updateDigitalCard(DigitalCard digitalCard);
    void deleteDigitalCard(DigitalCard digitalCard);
    List<DigitalCard> getAllDigitalCards();

    DigitalCard getDigitalCardById(Long id);
}