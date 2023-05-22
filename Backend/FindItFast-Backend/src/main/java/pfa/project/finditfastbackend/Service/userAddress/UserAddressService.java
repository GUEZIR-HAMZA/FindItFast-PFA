package pfa.project.finditfastbackend.Service.userAddress;

import pfa.project.finditfastbackend.Model.UserAddress;

import java.util.List;

public interface UserAddressService {
    void addAddress(UserAddress userAddress);
    void deleteAddress(UserAddress userAddress);
    UserAddress getAddressByStreet(String street);
    List<UserAddress> getAllAddresses();
}
