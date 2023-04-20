package pfa.project.finditfastbackend.Service.digitalcard;

import pfa.project.finditfastbackend.Model.DigitalCard;

import java.util.List;

public interface DigitalCardService {

    boolean addDigitalCard(DigitalCard digitalCard);
    boolean updateDigitalCard(DigitalCard digitalCard);
    boolean deleteDigitalCard(DigitalCard digitalCard);
    List<DigitalCard> getAllDigitalCards();

    DigitalCard getDigitalCardById(Long id);

    boolean addAddressToDigitalCard(Long id, String street_address, String city, String state, String zip_code,String country);
}