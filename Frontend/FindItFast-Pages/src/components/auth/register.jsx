import React, { useState } from 'react';
import firebase from 'firebase/app';
import 'firebase/auth';
import './login-register.css';

const Register = () => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [confirmPassword, setConfirmPassword] = useState('');

  const handleUsernameChange = (event) => {
    setUsername(event.target.value);
  };

  const handlePasswordChange = (event) => {
    setPassword(event.target.value);
  };

  const handleConfirmPasswordChange = (event) => {
    setConfirmPassword(event.target.value);
  };

  const handleRegister = (event) => {
    event.preventDefault();
    if (password !== confirmPassword) {
      // handle password mismatch error
      return;
    }
    firebase.auth().createUserWithEmailAndPassword(username, password)
      .then((userCredential) => {
        // Signed in
        const user = userCredential.user;
        // handle successful register
      })
      .catch((error) => {
        const errorCode = error.code;
        const errorMessage = error.message;
        // handle error
        });
    };
    
    const handleSocialRegister = (provider) => {
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
        // handle successful social register
        })
        .catch((error) => {
        const errorCode = error.code;
        const errorMessage = error.message;
        // handle error
        });
    };
    
    return (
        <form onSubmit={handleRegister}>
            <h2>Register</h2>
            <div>
              <label>Username:</label>
              <input type="text" value={username} onChange={handleUsernameChange} />
            </div>
            <div>
                <label>Password:</label>
                    <input type="password" value={password} onChange={handlePasswordChange} />
            </div>
            <div>
                <label>Confirm Password:</label>
                <input type="password" value={confirmPassword} onChange={handleConfirmPasswordChange} />
            </div>
            <button type="submit">Register</button>
            <div>
                <button onClick={() => handleSocialRegister('google')}>Register with Google</button>
                <button onClick={() => handleSocialRegister('facebook')}>Register with Facebook</button>
            </div>
        </form>
    );
    };