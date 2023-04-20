package pfa.project.finditfastbackend.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="digital_cards")
public class DigitalCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Basic Information
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "company", nullable = true)
    private String company;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "website", nullable = true)
    private String website;
    @Column(name = "linkedin_profile", nullable = true)
    private String linkedinProfile;
    @Column(name = "twitter_profile", nullable = true)
    private String twitterProfile;
    @Column(name = "facebook_profile", nullable = true)
    private String facebookProfile;
    @Column(name = "instagram_profile", nullable = true)
    private String instagramProfile;
    @ElementCollection
    private List<String> CustomText;

    // Address Information
    @Column(name = "street_address", nullable = false, length = 512)
    private String streetAddress;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "state", nullable = false)
    private String state;
    @Column(name = "postal_code", nullable = false)
    private String postalCode;
    @Column(name = "country", nullable = false)
    private String country;

    // Profile Picture or Logo
    @Column(name = "profile_picture", nullable = true)
    private byte[] profilePicture;

    @ElementCollection
    private List<byte[]> Address_pictures = new ArrayList<>();

    // Professional Experience
    @ElementCollection
    @Column(name = "experiences", nullable = true, length = 1024)
    private Set<String> experiences = new HashSet<>();

    // Education
    @ElementCollection
    @Column(name = "educations", nullable = true, length = 1024)
    private Set<String> educations = new HashSet<>();

    // Skills and Expertise
    @ElementCollection

    private Set<String> skills = new HashSet<>();

    // Interests and Hobbies
    @ElementCollection
    private Set<String> interests = new HashSet<>();

    // Awards and Honors

//    @ElementCollection
//    private List<String> awards = new ArrayList<>();

    // Certifications and Licenses
    @ElementCollection
    private Set<String> certifications = new HashSet<>();

    // Personal Statement or Bio
    @Column(name = "bio", nullable = true, length = 1024)
    private String bio;

    // getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLinkedinProfile() {
        return linkedinProfile;
    }

    public void setLinkedinProfile(String linkedinProfile) {
        this.linkedinProfile = linkedinProfile;
    }

    public String getTwitterProfile() {
        return twitterProfile;
    }

    public void setTwitterProfile(String twitterProfile) {
        this.twitterProfile = twitterProfile;
    }

    public String getFacebookProfile() {
        return facebookProfile;
    }

    public void setFacebookProfile(String facebookProfile) {
        this.facebookProfile = facebookProfile;
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
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Set<String> getExperiences() {
        return experiences;
    }

    public void setExperiences(Set<String> experiences) {
        this.experiences = experiences;
    }

    public Set<String> getEducations() {
        return educations;
    }

    public void setEducations(Set<String> educations) {
        this.educations = educations;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }

    public Set<String> getInterests() {
        return interests;
    }

    public void setInterests(Set<String> interests) {
        this.interests = interests;
    }

//    public List<String> getAwards() {
//        return awards;
//    }

//    public void setAwards(List<String> awards) {
//        this.awards = awards;
//    }

    public Set<String> getCertifications() {
        return certifications;
    }

    public void setCertifications(Set<String> certifications) {
        this.certifications = certifications;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setAddress(String street_address, String city, String state, String postal_code, String country) {
        this.streetAddress = street_address;
        this.city = city;
        this.state = state;
        this.postalCode = postal_code;
        this.country = country;
    }

    public String getAdress(){
        return this.streetAddress + ", " + this.city + ", " + this.state + ", " + this.postalCode + ", " + this.country;
    }
}

