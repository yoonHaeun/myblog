package com.myblog.myblog.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by HaEun on 2023/06/10
 */
@Controller
@RequiredArgsConstructor
public class GeneralController {


    @GetMapping("/home")
    public String home( String id, Model model){
//        Member member = memberService.currentMembers(id);
//        MemberEnrollment memberEnrollment = new MemberEnrollment(member.getId(), member.getPassword());
//        model.addAttribute("users", memberEnrollment);
        return "main/home";
    }

    @GetMapping("/menu")
    public String menuList(){
        return "main/mainMenu";
    }

}
