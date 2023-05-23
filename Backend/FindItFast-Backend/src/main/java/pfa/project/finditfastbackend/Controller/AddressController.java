package pfa.project.finditfastbackend.Controller;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pfa.project.finditfastbackend.Model.UserAddress;
import pfa.project.finditfastbackend.Service.userAddress.UserAddressService;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    private  UserAddressService userAddressService;

    @PostMapping("/all")
    public List<UserAddress> getAllAddresses() {
        return userAddressService.getAllAddresses();
    }

    @PostMapping("/add")
    public void addAddress(@Valid @RequestBody UserAddress userAddress) {
        userAddressService.addAddress(userAddress);
    }

    @PostMapping("/delete")
    public void deleteAddress(@Valid @RequestBody UserAddress userAddress) {
        userAddressService.deleteAddress(userAddress);
    }

    @PostMapping("/get/{street}")
    public UserAddress getAddressByStreet(@Valid @RequestBody String street) {
        return userAddressService.getAddressByStreet(street);
    }
}
