package com.example.app.history.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("history")
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String Home(){
      log.info("GEt/home...");
        return"home";
    }
}
