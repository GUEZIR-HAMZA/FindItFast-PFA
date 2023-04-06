package pfa.project.finditfastbackend.Service.digitalcard;

import org.springframework.stereotype.Service;
import pfa.project.finditfastbackend.Model.DigitalCard;

import java.util.List;

@Service
public class DigitalCardServiceImpl implements DigitalCardService{
    @Override
    public boolean addDigitalCard(DigitalCard digitalCard) {
        return false;
    }

    @Override
    public boolean updateDigitalCard(DigitalCard digitalCard) {
        return false;
    }

    @Override
    public boolean deleteDigitalCard(DigitalCard digitalCard) {
        return false;
    }

    @Override
    public List<DigitalCard> getAllDigitalCards() {
        return null;
    }

    @Override
    public DigitalCard getDigitalCardById(Long id) {
        return null;
    }
}
