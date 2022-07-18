package com.example.interviewPrep.quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping("/create")
    public String test(Model model){
        model.addAttribute("createTest", "이것은 Model로 가져온 값이다.");
        return "createTest";


    }


    @GetMapping("/java")
    public String javaTest(Model model){
        model.addAttribute("javaTest", "이것은 Model로 가져온 값이다.");
        return "javaTest";
    }


    @GetMapping("/spring")
    public String springTest(Model model){
        model.addAttribute("springTest", "이것은 Model로 가져온 값이다.");
        return "springTest";
    }

    @GetMapping("/network")
    public String networkTest(Model model){
        model.addAttribute("networkTest", "이것은 Model로 가져온 값이다.");
        return "networkTest";
    }

    @GetMapping("/database")
    public String databaseTest(Model model){
        model.addAttribute("databaseTest", "이것은 Model로 가져온 값이다.");
        return "databaseTest";
    }
}
