package pfa.project.finditfastbackend.Service.digitalcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfa.project.finditfastbackend.Model.DigitalCard;
import pfa.project.finditfastbackend.Repository.DegitalCardRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DigitalCardServiceImpl implements DigitalCardService{

    @Autowired
    DegitalCardRepository CardRepository;
    @Override
    public void addDigitalCard(DigitalCard digitalCard) {
        CardRepository.save(digitalCard);
    }

    @Override
    public void updateDigitalCard(DigitalCard digitalCard) {
        DigitalCard digitalCard1 = CardRepository.findById(digitalCard.getId()).get();
        if (digitalCard1 != null) {
            CardRepository.save(digitalCard);
        }
    }

    @Override
    public void deleteDigitalCard(DigitalCard digitalCard) {
           CardRepository.delete(digitalCard);
    }

    @Override
    public List<DigitalCard> getAllDigitalCards() {
        return CardRepository.findAll();
    }

    @Override
    public DigitalCard getDigitalCardById(Long id) {
        return CardRepository.findById(id).get();
    }

}