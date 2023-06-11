package com.myblog.myblog.main;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }



    @GetMapping("/home")
    public String home(){
        return "main/home";
    }

    @GetMapping("/menu")
    public String menuList(){
        return "main/mainMenu";
    }


}
