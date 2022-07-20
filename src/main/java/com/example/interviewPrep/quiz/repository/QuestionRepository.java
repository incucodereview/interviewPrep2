package com.example.interviewPrep.quiz.repository;


import com.example.interviewPrep.quiz.models.Question;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class QuestionRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Question question){
        em.persist(question);
    }

    public Question findOne(Long id){
        return em.find(Question.class, id);
    }

    public List<Question> findByTitle(String title){
        return em.createQuery("SELECT q from Question AS q where q.title = :title", Question.class)
                .setParameter("title", title)
                .getResultList();
    }


    public List<Question> findByType(String type){
        return em.createQuery("SELECT q from Question AS q where q.type = :type", Question.class)
                .setParameter("type", type)
                .getResultList();
    }

}
