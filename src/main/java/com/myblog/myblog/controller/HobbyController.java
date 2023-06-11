package com.myblog.myblog.controller;

import com.myblog.myblog.diary.Diary;
import com.myblog.myblog.diary.DiaryService;
import com.myblog.myblog.dto.DiaryEnrollment;
import com.myblog.myblog.dto.HobbyEnrollment;
import com.myblog.myblog.dto.MemberEnrollment;
import com.myblog.myblog.hobby.Hobby;
import com.myblog.myblog.hobby.HobbyService;
import com.myblog.myblog.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by HaEun on 2023/06/10
 */
@Controller @RequiredArgsConstructor
public class HobbyController {

    private final HobbyService hobbyService;

    @GetMapping("/hobbyList")
    public String hobbyList(Model model){
        List<Hobby> hobby = hobbyService.hobbyList();
        model.addAttribute("hobby", hobby);
        return "hobby/hobbyList";
    }

//    @GetMapping("/hobby/{date}")
//    public String hobby(@PathVariable LocalDate date, Model model){
//        Hobby hobby = hobbyService.currentHobby(date);
//        HobbyEnrollment hobbyEnrollment = new HobbyEnrollment(hobby.getHoId(),hobby.getHoTitle(),hobby.getHoContext(),hobby.getHoDate().toString());
//        model.addAttribute("hobby", hobbyEnrollment);
//        return "hobby/hobby";
//    }

    @GetMapping("/hobby")
    public String hobby(){
        return "hobby/hobby";
    }

//    @PostMapping("/hobby")
//    public String hobbyProc(@ModelAttribute("hobby") HobbyEnrollment e){
//        Long hoId = e.getHoId();
//        String hoTitle = e.getHoTitle();
//        String hoContent = e.getHoContext();
//        String hoDate = e.getHoDate();
//        hobbyService.updateHobby(hoId,hoTitle,hoContent);
//        return "redirect:/hobby";
//    }

    @PostMapping("/newHobby")
    public String newHobby(@ModelAttribute HobbyEnrollment hobbyEnrollment) {
        hobbyService.createHobby(hobbyEnrollment);
        return "redirect:/hobbyList";
    }

}
