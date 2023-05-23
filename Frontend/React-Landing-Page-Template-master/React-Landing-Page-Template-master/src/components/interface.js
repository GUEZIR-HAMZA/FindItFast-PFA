import { useLocation } from "react-router-dom";
import QRCode from "qrcode.react";
import { useState } from "react";







  const InterfaceQR = () => {
    const { pathname } = useLocation();
    const name = pathname.substring(1, pathname.indexOf("/", 2));
    const tfa7a="InterfaceQR";
    const [value, setValue] = useState(`${window.location.host}/${name}/${tfa7a}`);
    
    function handleCopyLink() {
      const input = document.querySelector('.copy-link-input');
      input.select();
      document.execCommand('copy');
    }
    
   
    return (
      <div className="contain">
        
        <div className="item-1">
          
        <img  className="img" alt="Image of a person" />
            <div className="hi">Hi {name} that's your custum digital card </div>
        </div>

        <div className="item-2">
          <div  className="qr">
            <QRCode value={`${window.location.host}/${name}/${tfa7a}`} />

          </div>
        </div>
    <div className="linkk">  
        <div className="copy-link">
              <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />
              <input type="text" className="copy-link-input" value={value} readOnly />
              <button type="button" className="copy-link-button" onClick={handleCopyLink}>
                <span className="material-icons">content_copy</span>
              </button>
            </div>
    </div>
        <div className="item-3"> 

        <button className="button-85" onClick={() => {

if (navigator.share) {
  navigator.share({
    title: 'Title of the shared content',
    text: 'Description of the shared content',
    url: 'https://example.com'
  });

  const width = 550;
  const height = 400;
  const left = window.innerWidth / 2 - width / 2;
  const top = window.innerHeight / 2 - height / 2;
  window.open('', 'share', `width=${width},height=${height},left=${left},top=${top}`);
}
  
}}>
  Share Card ➤
</button>
        </div>
        <div className="item-4">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</link>
        <ul>

          <li>
            <a class="facebook" href="#">
              <span></span>
              <span></span>
              <span></span>
              <span></span>
              <i class="fa fa-facebook" aria-hidden="true"></i>
            </a>
          </li>

          <li>
            <a class="twitter" href="#">
              <span></span>
              <span></span>
              <span></span>
              <span></span>
              <i class="fa fa-twitter" aria-hidden="true"></i>
            </a>
          </li>

          <li>
            <a class="instagram" href="#">
              <span></span>
              <span></span>
              <span></span>
              <span></span>
              <i class="fa fa-instagram" aria-hidden="true"></i>
            </a>
          </li>

          <li>
            <a class="google" href="#">
              <span></span>
              <span></span>
              <span></span>
              <span></span>
              <i class="fa fa-google" aria-hidden="true"></i>
            </a>
          </li>
          <li>
            <a class="whatsapp" href="#">
              <span></span>
              <span></span>
              <span></span>
              <span></span>
              <i class="fa fa-whatsapp" aria-hidden="true"></i>
            </a>
          </li>
        </ul>

        </div>
        <div className="item-5">
        Your Location is :
        <div className="map-container">
      <iframe
        title="My Map"
        width="100%"
        height="100%"
        frameborder="0"
        style={{ border: 0 }}
        src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3386.266312310857!2d-8.014998000000001!3d31.631391399999997!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xdafeff9b496d9f5%3A0x551e78972fc827f4!2sEMSI%20GUELIZ!5e0!3m2!1sen!2sus!4v1650490407933!5m2!1sen!2sus"

        allowfullscreen=""
        aria-hidden="false"
        tabindex="0"
      ></iframe>
    </div>
            
        </div>
      </div> 
      
      
    );
  };
  
  


export default InterfaceQR;
