import { BrowserRouter, Routes, Route } from "react-router-dom";
import Landingpage from "./Landingpage";
import InterfaceQR from "./components/interface"
import Signup from "./components/Signin"

import QrCodeGenerator from "./components/QrCodeGenerator";
import "./Landingpage.css";

import "./components/QrCodeGenerator.css";

const App = () => {

  return (
    <div>
      <BrowserRouter>
      <Routes>
      <Route path="/QrCode" element={<Signup />} />
        <Route path="/QrCode" element={<QrCodeGenerator />} />
        <Route path="/InterfaceQR" element={<InterfaceQR />} />
        <Route path="/Landingpage" element={<Landingpage />} />
        
      </Routes>
    </BrowserRouter>
      
    </div>
  );
};

export default App;
