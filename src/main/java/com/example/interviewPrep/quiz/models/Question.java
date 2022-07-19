package com.example.interviewPrep.quiz.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Question {

    @Id @GeneratedValue
    @Column(name = "QUESTION_ID")
    private Long id;

    private String title;
    private String type;

}
