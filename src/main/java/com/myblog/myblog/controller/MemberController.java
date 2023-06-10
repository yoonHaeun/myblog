package com.myblog.myblog.controller;

import com.myblog.myblog.dto.MemberEnrollment;
import com.myblog.myblog.member.Member;
import com.myblog.myblog.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    //로그인 관리
    @GetMapping("/loginForm")
    public String loginForm(Model model) {
        List<Member> memberList = memberService.memberList();
        model.addAttribute("memberList", memberList);
        return "user/login";
    }

//    @PostMapping("/login")
//    public String login(String id, String password){
////        log.info("id : {} , pw : {}", id, password);
//        Users users = this.users.findUsers(id, password);
//        if(users != null) {
//            return "redirect:/";
//        }
//        return "user/loginForm";
//    }

    @PostMapping("/login")
    public String login(@ModelAttribute("member") Member member) {
//        if(memberService.login(member)){
//            return "redirect:/home/{id}";
//        }
        return "redirect:/home";
    }




    //회원가입 관리
    @PostMapping("/join")
    public String newUser(@ModelAttribute MemberEnrollment memberEnrollment) {
        memberService.createUsers(memberEnrollment);
        return "redirect:/";
    }


    @GetMapping("/joinForm")
    public String joinForm(){return "user/joinForm";}





    //멤버 관리
    @GetMapping("/member/{id}")
    public String member(@PathVariable String id, Model model){
        Member member = memberService.currentMembers(id);
        MemberEnrollment memberEnrollment = new MemberEnrollment(member.getId(), member.getPassword());
        model.addAttribute("users", memberEnrollment);
        return "member/member";
    }

    @GetMapping("/users-update/{id}")
    public String memberUpdate(@PathVariable String id, Model model){
        Member member = memberService.currentMembers(id);
        MemberEnrollment memberEnrollment = new MemberEnrollment(member.getId(), member.getPassword());
        model.addAttribute("users", memberEnrollment);
        return "member/member-update";
    }

    @PostMapping("/users-update/")
    public String usersUpdateProc(@ModelAttribute("member") MemberEnrollment e){
        String usersId = e.getId();
        String usersPassword = e.getPassword();
        memberService.updateUsers(usersId,usersPassword);
        return "redirect:/member/{id}";
    }




}
