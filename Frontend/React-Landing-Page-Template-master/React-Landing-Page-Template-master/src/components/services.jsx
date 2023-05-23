import React from "react";

export const Services = (props) => {
  return (
    <div id="services" className="text-center">
      <div className="container">
        <div className="section-title">
          <h2>Our Services</h2>
          <p>
          At Find it Fast, we offer a range of services to help you optimize your customer experience and streamline your business operations. From personalized QR codes to efficient customer information collection, we've got you covered. Our team of experts will work with you to understand your unique business needs and provide customized solutions to help you achieve your goals. Whether you're a small startup or a large enterprise, we've got the tools and expertise to take your business to the next level. Choose Find it Fast for all your customer engagement and information management needs.
          </p>
        </div>
        <div className="row">
          {props.data
            ? props.data.map((d, i) => (
                <div key={`${d.name}-${i}`} className="col-md-4">
                  {" "}
                  <i className={d.icon}></i>
                  <div className="service-desc">
                    <h3>{d.name}</h3>
                    <p>{d.text}</p>
                  </div>
                </div>
              ))
            : "loading"}
        </div>
      </div>
    </div>
  );
};
