package com.example.interviewPrep.quiz.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDTO {

    private Long id;

    @NotNull
    private String title;
    @NotNull
    private String type;

}
