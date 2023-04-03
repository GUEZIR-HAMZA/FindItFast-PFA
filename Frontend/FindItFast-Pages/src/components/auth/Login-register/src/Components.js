 import styled from 'styled-components';

 export const Container = styled.div`
 background-color: #fff;
 border-radius: 10px;
 box-shadow: 0 14px 28px rgba(0, 0, 0, 0.25), 0 10px 10px rgba(0, 0, 0, 0.22);
 position: relative;
 overflow: hidden;
 width: 678px;
 max-width: 100%;
 min-height: 400px;
 `;

 export const SignUpContainer = styled.div`
  position: absolute;
  top: 0;
  height: 100%;
  transition: all 0.6s ease-in-out;
  left: 0;
  width: 50%;
  opacity: 0;
  z-index: 1;
  ${props => props.signinIn !== true ? `
    transform: translateX(100%);
    opacity: 1;
    z-index: 5;
  ` 
  : null}
 `;
 

 export const SignInContainer = styled.div`
 position: absolute;
 top: 0;
 height: 100%;
 transition: all 0.6s ease-in-out;
 left: 0;
 width: 50%;
 z-index: 2;
 ${props => (props.signinIn !== true ? `transform: translateX(100%);` : null)}
 `;
 
 export const Form = styled.form`
 background-color: #ffffff;
 display: flex;
 align-items: center;
 justify-content: center;
 flex-direction: column;
 padding: 0 50px;
 height: 100%;
 text-align: center;
 `;
 
 export const Title = styled.h1`
 font-weight: bold;
 margin: 0;
 `;
 
 export const Input = styled.input`
 background-color: #eee;
 border: none;
 padding: 12px 15px;
 margin: 8px 0;
 width: 100%;
 `;
 

 export const Button1 = styled.button`
 position: absolute;
 top: 87%;
 left: 50%;
    border-radius: 20px;
    border: 1px solid #000000;
    background:linear-gradient(
      157.81deg,
      ,
      #ffffff -43.27%,
      #bef3f5 -21.24%,
      #00ff9d 12.19%,
      #87E1C7 29.82%,
      #339476 51.94%,
      #8d0192  90.29%
    );
    *-webkit-text-fill-color: transparent;
    color: #fffff;
    font-size: 12px;
    font-weight: bold;
    padding: 12px 45px;
    letter-spacing: 1px;
    text-transform: uppercase;
    transition: transform 80ms ease-in;
 
 transform: translate(-50%, -50%);
    &:focus {
        outline: none;
    }
    &:hover {
      animation: animate 8s linear infinite;
      @keyframes animate {
        0% {
          background-position: 0%;
        }
        100% {
          background-position: 400%;
        }
    }
    &:hover:before {
      filter: blur(20px);
      opacity: 1;
      animation: animate 8s linear infinite;
    }
    &:before {
      content: "";
      position: absolute;
      top: -5px;
      left: -5px;
      right: -5px;
      bottom: -5px;
      z-index: -1;
      background: linear-gradient(45deg, #00ff9d,violet, purple, #7c3697);
      background-size: 300%;
      border-radius: 40px;
      opacity: 0;
      transition: 0.5%;
    }
`;
export const Button2 = styled.button`
position: absolute;
top: 80%;
left: 50%;
   border-radius: 20px;
   border: 1px solid #000000;
   background:linear-gradient(
     157.81deg,
     ,
     #ffffff -43.27%,
     #bef3f5 -21.24%,
     #00ff9d 12.19%,
     #87E1C7 29.82%,
     #339476 51.94%,
     #8d0192  90.29%
   );
   *-webkit-text-fill-color: transparent;
   color: #fffff;
   font-size: 12px;
   font-weight: bold;
   padding: 12px 45px;
   letter-spacing: 1px;
   text-transform: uppercase;
   transition: transform 80ms ease-in;

transform: translate(-50%, -50%);
   &:focus {
       outline: none;
   }
   &:hover {
     animation: animate 8s linear infinite;
     @keyframes animate {
       0% {
         background-position: 0%;
       }
       100% {
         background-position: 400%;
       }
   }
   &:hover:before {
     filter: blur(20px);
     opacity: 1;
     animation: animate 8s linear infinite;
   }
   &:before {
     content: "";
     position: absolute;
     top: -5px;
     left: -5px;
     right: -5px;
     bottom: -5px;
     z-index: -1;
     background: linear-gradient(45deg, #00ff9d,violet, purple, #7c3697);
     background-size: 300%;
     border-radius: 40px;
     opacity: 0;
     transition: 0.5%;
   }
`;
 export const Button = styled.button`
 position: absolute;
 top: 80%;
 left: 50%;
 transform: translate(-50%, -50%);
 width: 150px;
 height: 40px;
 text-align: center;
 font-weight: bold;
 letter-spacing: 1px;
 color: #fff;
 font-size: 12px;
 text-transform: uppercase;
 text-decoration: none;
 font-family: Montserrat,sans-serif;
 box-sizing: border-box;
 background: linear-gradient(90deg, #00ff9d, #339476, #bef3f5, violet,purple, blue);
 background-size: 400%;
 border-radius: 20px;
 border: 1px solid #000000;
 z-index: 1;

    &:focus {
        outline: none;
    }
    &:hover {
      animation: animate 8s linear infinite;
      @keyframes animate {
        0% {
          background-position: 0%;
        }
        100% {
          background-position: 400%;
        }
    }
    &:hover:before {
      filter: blur(20px);
      opacity: 1;
      animation: animate 8s linear infinite;
    }
    &:before {
      content: "";
      position: absolute;
      top: -5px;
      left: -5px;
      right: -5px;
      bottom: -5px;
      z-index: -1;
      background: linear-gradient(45deg, #00ff9d,violet, purple, #7c3697);
      background-size: 300%;
      border-radius: 40px;
      opacity: 0;
      transition: 0.5%;
    }
 `;
 export const GhostButton = styled(Button)`
 background-color: transparent;
 border-color: #ffffff;
 `;
 
 export const Anchor = styled.a`
 color: #333;
 font-size: 14px;
 text-decoration: none;
 margin: 15px 0;
 `;
 export const OverlayContainer = styled.div`
position: absolute;
top: 0;
left: 50%;
width: 50%;
height: 100%;
overflow: hidden;
transition: transform 0.6s ease-in-out;
z-index: 100;
${props =>
  props.signinIn !== true ? `transform: translateX(-100%);` : null}
`;

export const Overlay = styled.div`
background:  linear-gradient(
  157.81deg,
  #ffffff -43.27%,
  #bef3f5 -21.24%,
  #00ff9d 12.19%,
  #8d0192 29.82%,
  #339476 51.94%,
  #8d0192  90.29%
);
background: -webkit-linear-gradient(to right, #ff4b2b, #ff416c);
background:  linear-gradient(
  157.81deg,
  #ffffff -43.27%,
  #bef3f5 -21.24%,
  #00ff9d 12.19%,
  #8d0192 29.82%,
  #339476 51.94%,
  #8d0192  90.29%
);
background-repeat: no-repeat;
background-size: cover;
background-position: 0 0;
color: #ffffff;
position: relative;
left: -100%;
height: 100%;
width: 200%;
transform: translateX(0);
transition: transform 0.6s ease-in-out;
${props => (props.signinIn !== true ? `transform: translateX(50%);` : null)}
`;
 
 export const OverlayPanel = styled.div`
     position: absolute;
     display: flex;
     align-items: center;
     justify-content: center;
     flex-direction: column;
     padding: 0 40px;
     text-align: center;
     top: 0;
     height: 100%;
     width: 50%;
     transform: translateX(0);
     transition: transform 0.6s ease-in-out;
 `;

 export const LeftOverlayPanel = styled(OverlayPanel)`
   transform: translateX(-20%);
   ${props => props.signinIn !== true ? `transform: translateX(0);` : null}
 `;

 export const RightOverlayPanel = styled(OverlayPanel)`
     right: 0;
     transform: translateX(0);
     ${props => props.signinIn !== true ? `transform: translateX(20%);` : null}
 `;

 export const Paragraph = styled.p`
 font-size: 14px;
   font-weight: 100;
   line-height: 20px;
   letter-spacing: 0.5px;
   margin: 20px 0 30px
 `;