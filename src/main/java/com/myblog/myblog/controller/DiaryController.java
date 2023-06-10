package com.myblog.myblog.controller;

import com.myblog.myblog.diary.Diary;
import com.myblog.myblog.diary.DiaryService;
import com.myblog.myblog.dto.DiaryEnrollment;
import com.myblog.myblog.dto.MemberEnrollment;
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
public class DiaryController {

    private final DiaryService diaryService;

    @GetMapping("/diaryList")
    public String diaryList(Model model){
        List<Diary> diary = diaryService.diaryList();
        model.addAttribute("diary", diary);
        return "diary/diaryList";
    }

    @GetMapping("/diary")
    public String diary(){
        return "diary/diary";
    }

    @PostMapping("/newDiary")
    public String newDiary(@ModelAttribute DiaryEnrollment diaryEnrollment) {
        diaryService.createDiary(diaryEnrollment);
        return "redirect:/diaryList";
    }

}
