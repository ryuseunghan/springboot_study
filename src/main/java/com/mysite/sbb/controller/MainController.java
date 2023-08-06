package com.mysite.sbb.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MainController {


    @GetMapping("/sbb")
    @ResponseBody
    public String index(){
        return "index";
    }

    @GetMapping("/")
    public String root(){
        return "redirect:/question/list";
    }

}
