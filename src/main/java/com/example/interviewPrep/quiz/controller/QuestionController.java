package com.example.interviewPrep.quiz.controller;

import com.example.interviewPrep.quiz.models.Question;
import com.example.interviewPrep.quiz.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test")
@RequiredArgsConstructor
public class QuestionController {

    @Autowired
    private final QuestionService questionService;

    @GetMapping("/create")
    public String test(Model model){
        model.addAttribute("createTest", "이것은 Model로 가져온 값이다.");
        return "createTest";
    }


    @GetMapping("/{type}")
    public String getTest(Model model, @PathVariable String type){
        List<Question> questions = questionService.findQuestionsByType(type);
        model.addAttribute("questions", questions);
        return "test";
    }


}
