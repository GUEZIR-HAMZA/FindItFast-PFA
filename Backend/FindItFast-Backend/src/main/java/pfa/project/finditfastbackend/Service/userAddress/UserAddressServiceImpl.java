package pfa.project.finditfastbackend.Service.userAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfa.project.finditfastbackend.Model.UserAddress;
import pfa.project.finditfastbackend.Repository.UserAddressRepository;

import java.util.List;

@Service
public class UserAddressServiceImpl implements UserAddressService {

    @Autowired
    private UserAddressRepository userAddressRepository;
    @Override
    public void addAddress(UserAddress userAddress) {
        userAddressRepository.save(userAddress);

    }

    @Override
    public void deleteAddress(UserAddress userAddress) {
        userAddressRepository.delete(userAddress);
    }

    @Override
    public UserAddress getAddressByStreet(String street) {
        return userAddressRepository.findByStreet(street);
    }

    @Override
    public List<UserAddress> getAllAddresses() {
        return userAddressRepository.findAll();
    }
}
