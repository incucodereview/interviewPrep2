import React, { useEffect, useState } from 'react';
import axios from 'axios';


const Login = () => {

    
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');


    const handleEmailChange = (e) => {
        setEmail(e.target.value);
    }

    
    const handlePasswordChange = (e) => {
        setPassword(e.target.value);
    }


    useEffect(() =>{
       

    });

    const onSubmit = () => {
        axios.post("http://localhost:8080/login", {
            email: email,
            password: password,
        }).then(function (response) {
            console.log(response);
            if(response.status === 200){
                window.location.href="/test";
            }
        }).catch(function (error) {
            alert("이메일 혹은 비밀번호가 잘못 입력되었습니다.");
        });
    }


    return(
        <div>
        이메일
        <input
          type="email"
          id="email"
          placeholder="Enter email"
          value={email}
          onChange={handleEmailChange}
        />
        비밀번호
        <input
          type="password"
          id="password"
          placeholder="Password"
          value={password}
          onChange={handlePasswordChange}
        />
        <button onClick={onSubmit}>로그인</button>
      </div>
    );


};


export default Login;