package com.myblog.myblog.controller;

import com.myblog.myblog.diary.Diary;
import com.myblog.myblog.diary.DiaryService;
import com.myblog.myblog.dto.DiaryEnrollment;
import com.myblog.myblog.dto.ScheduleEnrollment;
import com.myblog.myblog.schedule.Schedule;
import com.myblog.myblog.schedule.ScheduleService;
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
public class ScheduleController {

    private final ScheduleService scheduleService;

    @GetMapping("/scheduleList")
    public String scheduleList(Model model){
        List<Schedule> schedule = scheduleService.scheduleList();
        model.addAttribute("schedule", schedule);
        return "schedule/scheduleList";
    }

    @GetMapping("/schedule")
    public String schedule(){
        return "schedule/schedule";
    }

    @PostMapping("/newSchedule")
    public String newSchedule(@ModelAttribute ScheduleEnrollment e) {
        scheduleService.createSchedule(e);
        return "redirect:/scheduleList";
    }

}
