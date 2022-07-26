package com.example.interviewPrep.quiz.controller;

import com.example.interviewPrep.quiz.domain.Answer;
import com.example.interviewPrep.quiz.domain.Question;
import com.example.interviewPrep.quiz.dto.AnswerDTO;
import com.example.interviewPrep.quiz.dto.QuestionDTO;
import com.example.interviewPrep.quiz.service.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class AnswerController {

    private final AnswerService answerService;

    @PostMapping("/answer")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Answer> create(@RequestBody @Valid List<AnswerDTO> answerDTOs){
        return answerService.createAnswers(answerDTOs);
    }
}
