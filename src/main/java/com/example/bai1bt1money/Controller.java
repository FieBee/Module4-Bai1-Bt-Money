package com.example.bai1bt1money;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/aloso")
    public String alo(){
        return "aloso";
    }

    @PostMapping("/usd")
    public String submit(@RequestParam double usd, double rate, Model model){
        double result = usd*rate;
        model.addAttribute("result",result);
        return "aloso";
    }

}
