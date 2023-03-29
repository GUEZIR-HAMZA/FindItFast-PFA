import React, { useState } from 'react';
import firebase from 'firebase/app';
import 'firebase/auth';
import './login-register.css';

const Login = () => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  const handleUsernameChange = (event) => {
    setUsername(event.target.value);
  };

  const handlePasswordChange = (event) => {
    setPassword(event.target.value);
  };

  const handleLogin = (event) => {
    event.preventDefault();
    firebase.auth().signInWithEmailAndPassword(username, password)
      .then((userCredential) => {
        // Signed in
        const user = userCredential.user;
        // handle successful login
      })
      .catch((error) => {
        const errorCode = error.code;
        const errorMessage = error.message;
        // handle error
      });
  };

  const handleSocialLogin = (provider) => {
    let authProvider;
    if (provider === 'google') {
      authProvider = new firebase.auth.GoogleAuthProvider();
    } else if (provider === 'facebook') {
      authProvider = new firebase.auth.FacebookAuthProvider();
    }
    firebase.auth().signInWithPopup(authProvider)
      .then((result) => {
        // This gives you a Google Access Token. You can use it to access the Google API.
        const credential = result.credential;
        // The signed-in user info.
        const user = result.user;
        // handle successful social login
      })
      .catch((error) => {
        const errorCode = error.code;
        const errorMessage = error.message;
        // handle error
      });
  };

  return (
    <form onSubmit={handleLogin}>
      <h2>Login</h2>
      <div>
        <label>Username:</label>
        <input type="text" value={username} onChange={handleUsernameChange} />
      </div>
      <div>
        <label>Password:</label>
        <input type="password" value={password} onChange={handlePasswordChange} />
      </div>
      <button type="submit">Login</button>
      <div>
        <button onClick={() => handleSocialLogin('google')}>Login with Google</button>
        <button onClick={() => handleSocialLogin('facebook')}>Login with Facebook</button>
      </div>
    </form>
  );
};

export default Login;
