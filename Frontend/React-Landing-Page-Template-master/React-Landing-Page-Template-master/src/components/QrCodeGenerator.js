import React, { useState } from "react";
import { navigate } from "@reach/router";
import { createCard } from "./services/apiResquest";


function QrCodeGenerator() {
  const [formData, setFormData] = useState({
    name: "",
    title: "",
    company: "",
    email: "",
    phone: "",
    website: "",
    streetAdress: "",
    city: "",
    state: "",
    postalCode: "",
    country: "",
    description: "",
    linkedin: "",
    github: "",
    facebook: "",
  });

  const handleInputChange = (event) => {
    const { name, value } = event.target;
    setFormData({ ...formData, [name]: value });
  };

  const handleSubmit = async (event) => {
    event.preventDefault();
    await createCard("/card1", formData);
    navigate(`/${formData.name}/InterfaceQR`);
  };

  const onClick = async () => {
    await createCard("/card1", formData);
    navigate(`/${formData.name}/InterfaceQR`);
    window.location.reload();
  };

  return (
    <div className="container12">
      <section>
        <h2 className="label">
          Hi, please complete the form below to get your business card online!
        </h2>
      </section>
      <form onSubmit={handleSubmit}>
        <section className="form-section">
          <h3 className="st">Personal Informations</h3>
          <div className="form-group">
            <label htmlFor="name">
              <i className="fa fa-user"></i>
            </label>
            <input
              type="text"
              id="name"
              name="name"
              value={formData.name}
              onChange={handleInputChange}
              className="input1"
              placeholder="Your Name"
              required
            />
          </div>
          <div className="form-group">
            <label htmlFor="title">
              <i className="fa fa-id-badge"></i>
            </label>
            <input
              type="text"
              id="title"
              name="title"
              value={formData.title}
              onChange={handleInputChange}
              className="input1"
              placeholder="Job Title"
            />
          </div>
          <div className="form-group">
            <label htmlFor="company">
              <i className="fa fa-building"></i>
            </label>
            <input
              type="text"
              id="company"
              name="company"
              value={formData.company}
              onChange={handleInputChange}
              className="input1"
              placeholder="Company Name"
            />
          </div>
          <div className="form-group">
            <label htmlFor="email">
              <i className="fa fa-envelope"></i>
            </label>
            <input
              type="email"
              id="email"
              name="email"
              value={formData.email}
              onChange={handleInputChange}
              className="input1"
              placeholder="Email Address"
              required
            />
          </div>
          <div className="form-group">
            <label htmlFor="phone">
              <i className="fa fa-phone"></i>
            </label>
            <input
              type="tel"
              id="phone"
              name="phone"
              value={formData.phone}
              onChange={handleInputChange}
              className="input1"
              placeholder="Phone Number"
            />
          </div>
          <div className="form-group">
            <label htmlFor="website">
              <i className="fa fa-globe"></i>
            </label>
            <input
              type="url"
              id="website"
              name="website"
              value={formData.website}
              onChange={handleInputChange}
              className="input1"
              placeholder="Website"
            />
          </div>
        </section>
        <section className="form-section">
          <h3 className="st">Address</h3>
          <div className="form-group">
            <label htmlFor="streetAdress">
              <i className="fa fa-map-marker"></i>
            </label>
            <input
              type="text"
              id="streetAdress"
              name="streetAdress"
              value={formData.streetAdress}
              onChange={handleInputChange}
              className="input"
              placeholder="Street Address"
            />
          </div>
          <div className="form-group">
            <label htmlFor="city">
              <i className="fa fa-map-marker"></i>
            </label>
            <input
              type="text"
              id="city"
              name="city"
              value={formData.city}
              onChange={handleInputChange}
              className="input"
              placeholder="City"
            />
          </div>
          <div className="form-group">  
            <label htmlFor="state">
              <i className="fa fa-map-marker"></i>
            </label>
            <input
              type="text"
              id="state"
              name="state"
              value={formData.state}
              onChange={handleInputChange}
              className="input"
              placeholder="State"
            />
          </div>
          <div className="form-group">
            <label htmlFor="postalCode">
              <i className="fa fa-map-marker"></i>
            </label>
            <input
              type="text"
              id="postalCode"
              name="postalCode"
              value={formData.postalCode}
              onChange={handleInputChange}
              className="input"
              placeholder="Postal Code"
            />
          </div>
          <div className="form-group">
            <label htmlFor="country">
              <i className="fa fa-map-marker"></i>
            </label>
            <input
              type="text"
              id="country"
              name="country"
              value={formData.country}
              onChange={handleInputChange}
              className="input"
              placeholder="Country"
            />
          </div>
          <div className="form-group">
            <label htmlFor="addressLocationPictures">
              <i className="fa fa-camera"></i>
            </label>
            <input
              type="file"
              id="addressLocationPictures"
              name="addressLocationPictures"
              value={formData.addressLocationPictures}
              onChange={handleInputChange}
              className="input"
              placeholder="Address Location Pictures"
              multiple={true}
              accept="image/*"
              max="5"
            />
          </div>
        </section>
        <section className="form-section">
          <h3 className="st">About</h3>
          <div className="form-group">
            <label htmlFor="description">
              <i className="fa fa-info"></i>
            </label>
            <textarea
              id="description"
              name="description"
              value={formData.description}
              onChange={handleInputChange}
              className="input1"
              placeholder="Description"
            ></textarea>
          </div>
        </section>
        <section className="form-section">
          <h3 className="st">Social Medias</h3>
          <div className="form-group">
            <label htmlFor="linkedin">  
              <i className="fa fa-linkedin"></i>
            </label>
            <input
              type="url"
              id="linkedin"
              name="linkedin"
              value={formData.linkedin}
              onChange={handleInputChange}
              className="input"
              placeholder="LinkedIn"
            />
          </div>
          <div className="form-group">
            <label htmlFor="facebook">
              <i className="fa fa-facebook"></i>
            </label>
            <input
              type="url"
              id="facebook"
              name="facebook" 
              value={formData.facebook}
              onChange={handleInputChange}
              className="input"
              placeholder="Facebook"
            />
          </div>
          <div className="form-group">
            <label htmlFor="twitter">
              <i className="fa fa-twitter"></i>
            </label>
            <input
              type="url"
              id="twitter"
              name="twitter"
              value={formData.twitter}
              onChange={handleInputChange}
              className="input"
              placeholder="Twitter"
            />
          </div>
          <div className="form-group">
            <label htmlFor="instagram">
              <i className="fa fa-instagram"></i>
            </label>
            <input
              type="url"
              id="instagram"
              name="instagram"
              value={formData.instagram}
              onChange={handleInputChange}
              className="input"
              placeholder="Instagram"
            />
          </div>

          <div className="form-group">
            <label htmlFor="Telegram">
              <i className="fa fa-telegram"></i>
            </label>
            <input
              type="url"
              id="telegram"
              name="telegram"
              value={formData.telegram}
              onChange={handleInputChange}
              className="input"
              placeholder="Telegram"
            /> 
          </div>  

         
        </section>
        <section className="form-section">
          <h3 className="st">Profile Picture</h3>
          <div className="form-group">
            <label htmlFor="photo">
              <i className="fa fa-camera"></i>
            </label>
            <input
              type="file"
              id="photo"
              name="photo"
              value={formData.photo}
              onChange={handleInputChange}
              className="input2"
              placeholder="Photo"
            />
          </div>
          <div className="form-group">
         <br />
         <div className="btn-container">
          <button className="button" type="submit" onClick={onClick}>
              Create DigitalCard
             </button>
             </div>
             </div>
        </section>
       
       
      </form>
    </div>
  );
}

export default QrCodeGenerator;
