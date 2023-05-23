import React from "react";
import { useHistory } from "react-router-dom";
import axios from "axios";

import * as Components from "./Conp.js";

const Signup = () => {
  const [signIn, toggle] = React.useState(true);
  const [name, setName] = React.useState("");
  const [email, setEmail] = React.useState("");
  const [password, setPassword] = React.useState("");
  const [error, setError] = React.useState("");

  const history = useHistory();

  const handleSignUp = async () => {
    try {
      const response = await axios.post("/api/signup", { name, email, password });
      console.log(response);
      history.push("/admin/dashboard");
    } catch (err) {
      console.error(err);
      setError("Failed to sign up. Please try again.");
    }
  };

  const handleSignIn = async () => {
    try {
      const response = await axios.post("/api/signin", { email, password });
      console.log(response);
      history.push("/dashboard");
    } catch (err) {
      console.error(err);
      setError("Failed to sign in. Please try again.");
    }
  };

  const handleSignUpFormSubmit = (event) => {
    event.preventDefault();
    handleSignUp();
  };

  const handleSignInFormSubmit = (event) => {
    event.preventDefault();
    handleSignIn();
  };

  return (

    <Components.Container>
      <Components.SignUpContainer signinIn={signIn}>
        <Components.Form onSubmit={handleSignUpFormSubmit}>
          <Components.Title>Create Account</Components.Title>
          <Components.Input type="text" placeholder="Name" value={name} onChange={(e) => setName(e.target.value)} />
          <Components.Input type="email" placeholder="Email" value={email} onChange={(e) => setEmail(e.target.value)} />
          <Components.Input type="password" placeholder="Password" value={password} onChange={(e) => setPassword(e.target.value)} />
          <Components.Button1>Sign Up</Components.Button1>
        </Components.Form>
      </Components.SignUpContainer>

      <Components.SignInContainer signinIn={signIn}>
        <Components.Form onSubmit={handleSignInFormSubmit}>
          <Components.Title>Sign in</Components.Title>
          <Components.Input type="email" placeholder="Email" value={email} onChange={(e) => setEmail(e.target.value)} />
          <Components.Input type="password" placeholder="Password" value={password} onChange={(e) => setPassword(e.target.value)} />
          <Components.Anchor href="#">Forgot your password?</Components.Anchor>
          <Components.Button2>Sign In</Components.Button2>
        </Components.Form>
      </Components.SignInContainer>

      <Components.OverlayContainer signinIn={signIn}>
        <Components.Overlay signinIn={signIn}>
          <Components.LeftOverlayPanel signinIn={signIn}>
            <Components.Title>Welcome Back!</Components.Title>
            <Components.Paragraph>
              To keep connected with us please login with your personal info
            </Components.Paragraph>
            <Components.GhostButton onClick={() => toggle(true)}> Sign In</Components.GhostButton>
          </Components.LeftOverlayPanel>

          <Components.RightOverlayPanel signinIn={signIn}>
            <Components.Title>Hello, Friend!</Components.Title>
            <Components.Paragraph>Enter Your personal details and start journey with us</Components.Paragraph>
            <Components.GhostButton onClick={() => toggle(false)}>Sign Up</Components.GhostButton>
          </Components.RightOverlayPanel>
        </Components.Overlay>
      </Components.OverlayContainer>
    </Components.Container>
    
  );
};

export default Signup;
