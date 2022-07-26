package com.example.interviewPrep.quiz.service;


import com.example.interviewPrep.quiz.domain.Answer;
import com.example.interviewPrep.quiz.domain.Question;
import com.example.interviewPrep.quiz.dto.AnswerDTO;
import com.example.interviewPrep.quiz.dto.QuestionDTO;
import com.example.interviewPrep.quiz.repository.AnswerRepository;
import com.example.interviewPrep.quiz.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AnswerService {

    @Autowired
    private final AnswerRepository answerRepository;

    public List<Answer> createAnswers(List<AnswerDTO> answerDTOs){

        List<Answer> answers = new ArrayList<>();

        for(AnswerDTO answerDTO: answerDTOs){
            Answer answer =  Answer.builder()
                    .content(answerDTO.getContent())
                    .build();

            answers.add(answer);
        }

        answerRepository.save(answers);
        return answers;
    }


}
