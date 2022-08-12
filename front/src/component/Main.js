import React from 'react';
import { Link } from 'react-router-dom';

const Main = () => {


    return(
        <div>
            <h1>당신의 기술 면접을 위한 최고의 솔루션</h1>
            <h2>답안을 작성하세요. 최고의 멘토들이 피드백 드립니다.</h2>
            <p>
                 서비스 첫 이용시 누구나 <strong>무료</strong>
            <Link to="/login">지금 이용하기</Link>
            </p>
        </div>
    );



}


export default Main;