package com.example.interviewPrep.quiz.service;

import com.example.interviewPrep.quiz.models.Question;
import com.example.interviewPrep.quiz.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class QuestionService {

    @Autowired
    private final QuestionRepository questionRepository;

    public Long add(Question question){
        questionRepository.save(question);
        return question.getId();
    }

    public List<Question> findQuestionsByType(String type){
        return questionRepository.findByType(type);
    }
}
