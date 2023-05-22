package pfa.project.finditfastbackend.Model;

import jakarta.persistence.*;

@Entity
@Table(name="user_address")
public class UserAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_address;

    @Column(name = "street_address", nullable = false, length = 512)
    private String streetAddress;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "region", nullable = false)
    private String region;

    @Column(name = "zip_code", nullable = false)
    private String zipCode;

    @Column(name = "country", nullable = false)
    private String country;

//    @Column(name = "address_picture", nullable = true)
//    private byte[] addressPicture;

    public int getId() {
        return id_address;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city= city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region= region;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode= zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country= country;
    }

//    public byte[] getAddressPicture() {
//        return addressPicture;
//    }
//
//    public void setAddressPicture(byte[] addressPicture) {
//        this.addressPicture= addressPicture;
//    }

}
