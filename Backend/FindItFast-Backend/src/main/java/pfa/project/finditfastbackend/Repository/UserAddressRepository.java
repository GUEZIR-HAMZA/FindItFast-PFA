package pfa.project.finditfastbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pfa.project.finditfastbackend.Model.UserAddress;

import java.util.Optional;


public interface UserAddressRepository extends JpaRepository<UserAddress, Long> {

    @Query("SELECT u FROM UserAddress u WHERE u.streetAddress =:street")
    UserAddress findByStreet(String street);
}
