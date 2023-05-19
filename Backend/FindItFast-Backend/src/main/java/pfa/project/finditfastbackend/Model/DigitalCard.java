package pfa.project.finditfastbackend.Model;

import jakarta.persistence.*;

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

    // Personal Statement or Bio
    @Column(name = "about", nullable = true, length = 1024)
    private String about;

    // Social Media
    @Column(name = "linkedin_profile", nullable = true)
    private String linkedinProfile;
    @Column(name = "facebook_profile", nullable = true)
    private String facebookProfile;
    @Column(name = "twitter_profile", nullable = true)
    private String twitterProfile;
    @Column(name = "instagram_profile", nullable = true)
    private String instagramProfile;
    @Column(name = "telegram_profile", nullable = true)
    private String telegramProfile;


    @OneToMany
    @JoinTable(name = "digital_card_address",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_address"))
    @Column(name = "address_list", nullable = true)
    private List<UserAddress> Address_list;

    // Profile Picture or Logo
    @Column(name = "profile_picture", nullable = true)
    private byte[] profilePicture;


    //stock digital card url
    @Column(name = "url", nullable = false)
    private String Url;

//    // Skills and Expertise
//    @ElementCollection
//
//    private Set<String> skills = new HashSet<>();
//
//    // Interests and Hobbies
//    @ElementCollection
//    private Set<String> interests = new HashSet<>();
//
//    // Awards and Honors
//
//    // Certifications and Licenses
//    @ElementCollection
//    private Set<String> certifications = new HashSet<>();


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

    public String getInstagramProfile() {
        return instagramProfile;
    }

    public void setInstagramProfile(String instagramProfile) {
        this.instagramProfile = instagramProfile;
    }

    public String getTelegramProfile() {
        return telegramProfile;
    }

    public void setTelegramProfile(String telegramProfile) {
        this.telegramProfile = telegramProfile;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }



//    public Set<String> getSkills() {
//        return skills;
//    }
//
//    public void setSkills(Set<String> skills) {
//        this.skills = skills;
//    }
//
//    public Set<String> getInterests() {
//        return interests;
//    }
//
//    public void setInterests(Set<String> interests) {
//        this.interests = interests;
//    }
//
//    public Set<String> getCertifications() {
//        return certifications;
//    }
//
//    public void setCertifications(Set<String> certifications) {
//        this.certifications = certifications;
//    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public String getAddressList(){
        return this.Address_list.toString();
    }

    public void setAddressList(List<UserAddress> address_list){
        this.Address_list = address_list;
    }

    public String getUrl(){
        return this.Url;
    }

    public void setUrl(String url){
        this.Url = url;
    }
}