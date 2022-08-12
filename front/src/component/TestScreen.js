import React, { useEffect, useState } from 'react';
import {useLocation} from "react-router-dom";
import axios from 'axios';
import styled from 'styled-components';

const TextArea = styled.textarea`
    width: 700px;
    height: 250px;
    resize: none;
`

const Question = styled.div`
    display: table-cell;
    vertical-align: middle;
`

const UL = styled.div`
    display: flex;
    align-items: center;
`


const TestScreen = () => {


    const[questions, setQuestions] = useState([]);

    const location = useLocation();
    const paths = location.pathname.split("/");
    const type = paths[2];

    useEffect(() =>{

        axios.get("http://localhost:8080/question/" + type, {
        }).then(async function (response) {
            if(response.data.result === "SUCCESS"){
                if(questions.length == 0){
                    await setQuestions(response.data.questionDTOs);
                }
            }
        }).catch(function (error) {
            console.log(error);
        });


    }, [questions]);



    return(
        <div>
            <h3>{type} 테스트</h3>
             <UL>{questions.map(question => <Question>{question.title}<TextArea></TextArea></Question>)}</UL>
        </div>
    );

}


export default TestScreen;