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
    public boolean addDigitalCard(DigitalCard digitalCard) {
        if(CardRepository.existsById(digitalCard.getId()) || CardRepository.findByName(digitalCard.getName()).isPresent()){
            return false;
        }
        CardRepository.save(digitalCard);
        return true;
    }

    @Override
    public boolean updateDigitalCard(DigitalCard digitalCard) {
        if(CardRepository.existsById(digitalCard.getId())) {
            CardRepository.save(digitalCard);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteDigitalCard(DigitalCard digitalCard) {
        if(CardRepository.existsById(digitalCard.getId())) {
            CardRepository.delete(digitalCard);
            return true;
        }
        return false;
    }

    @Override
    public List<DigitalCard> getAllDigitalCards() {
        return CardRepository.findAll();
    }
    @Override
    public DigitalCard getDigitalCardById(Long id) {
        Optional<DigitalCard> optionalDigitalCard = CardRepository.findById(id);
        return optionalDigitalCard.orElse(null);
    }

    @Override
    public boolean addAddressToDigitalCard(Long id, String street_address, String city, String state, String zip_code,String country)
    {
        Optional<DigitalCard> optionalDigitalCard = CardRepository.findById(id);
        if(optionalDigitalCard.isPresent())
        {
            DigitalCard digitalCard = optionalDigitalCard.get();
            digitalCard.setAddress(street_address,city,state,zip_code,country);
            CardRepository.save(digitalCard);
            return true;
        }
        return false;
    }
}