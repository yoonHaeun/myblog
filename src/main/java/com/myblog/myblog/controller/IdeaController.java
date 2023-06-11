package com.myblog.myblog.controller;

import com.myblog.myblog.dto.IdeaEnrollment;
import com.myblog.myblog.dto.NoticeEnrollment;
import com.myblog.myblog.idea.Idea;
import com.myblog.myblog.idea.IdeaService;
import com.myblog.myblog.notice.Notice;
import com.myblog.myblog.notice.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created by HaEun on 2023/06/10
 */
@Controller @RequiredArgsConstructor
public class IdeaController {

    private final IdeaService ideaService;

    @GetMapping("/ideaList")
    public String ideaList(Model model){
        List<Idea> idea = ideaService.ideaList();
        model.addAttribute("idea", idea);
        return "idea/idea";
    }

    @GetMapping("/idea")
    public String idea(){
        return "idea/idea";
    }

    @PostMapping("/newIdea")
    public String newIdea(@ModelAttribute IdeaEnrollment e) {
        ideaService.createIdea(e);
        return "redirect:/ideaList";
    }

}
