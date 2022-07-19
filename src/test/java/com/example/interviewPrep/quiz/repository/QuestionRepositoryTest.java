package com.example.interviewPrep.quiz.repository;

import com.example.interviewPrep.quiz.models.Question;
import com.example.interviewPrep.quiz.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class QuestionRepositoryTest {

    @Autowired
    EntityManager em;
    @Autowired
    QuestionService questionService;
    @Autowired
    QuestionRepository questionRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void save() throws Exception{

        // Given
        Question question = new Question();
        question.setTitle("test2");
        question.setType("java");

        // When
        Long savedId = questionService.add(question);

        // Then
        assertEquals(question, questionRepository.findOne(savedId));

    }

    @Test
    @Transactional
    @Rollback(false)
    public void findByType() throws Exception{

        // Given
        Question question = new Question();
        question.setType("java2");

        // When
        questionRepository.save(question);

        // Then
        Question result = questionRepository.findByType("java2").get(0);
        assertThat(question).isEqualTo(result);

    }

}