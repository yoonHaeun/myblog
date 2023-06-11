package com.myblog.myblog.controller;

import com.myblog.myblog.dto.NoticeEnrollment;
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
public class NoticeController {

    private final NoticeService noticeService;

    @GetMapping("/noticeList")
    public String noticeList(Model model){
        List<Notice> notice = noticeService.noticeList();
        model.addAttribute("notice", notice);
        return "notice/noticeList";
    }
//
//    @GetMapping("/notice")
//    public String notice(){
//        return "notice/notice";
//    }
//
//    @PostMapping("/newNotice")
//    public String newNotice(@ModelAttribute NoticeEnrollment e) {
//        noticeService.createNotice(e);
//        return "redirect:/noticeList";
//    }

}
