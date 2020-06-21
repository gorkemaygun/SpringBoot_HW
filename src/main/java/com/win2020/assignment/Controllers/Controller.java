package com.win2020.assignment.Controllers;



import org.springframework.web.bind.annotation.RequestMapping;

public class Controller {
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }

    @RequestMapping("/content")
        public String content(){
            return "content.html";
        }
    @RequestMapping("/submit")
        public String submit(){
            return "submit.html";
        }
    
}