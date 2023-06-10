package com.myblog.myblog.controller;

import com.myblog.myblog.mydiary.MyDiary;
import com.myblog.myblog.mydiary.MyDiaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by HaEun on 2023/06/10
 */
@Controller
@RequiredArgsConstructor
public class MyDiaryController {
    private final MyDiaryService myDiaryService;


    @GetMapping("/diary-list")
    public String viewBuildingList(Model model){
        List<MyDiary> buildingList = myDiaryService.diaryList();
        model.addAttribute("buildingList", buildingList);
        return "diary/diaryList";
    }



}
