package com.myblog.myblog.controller;

import com.myblog.myblog.dto.UsersEnrollment;
import com.myblog.myblog.users.Users;
import com.myblog.myblog.users.UsersService;
import com.myblog.myblog.diary.DiaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;
    private final DiaryRepository diaryRepository;

//    @GetMapping("/userList/{id}")
//    public String UserList(@PathVariable Long id, Model model){
//        List<Users> userList = usersService.getUserList(id);
//        Users users = userList.get(0);
//        model.addAttribute("user",users);
//        return "user/userList";
//    }
    @GetMapping("/joinForm")
    public String joinForm(){
        return "user/joinForm";
    }
    @GetMapping("/loginForm")
    public String loginForm(){
        return "user/loginForm";
    }

    @PostMapping("/join")
    public String newUser(@ModelAttribute UsersEnrollment usersEnrollment) {
        usersService.createUser(usersEnrollment);
        return "redirect:/";
    }
//    @PostMapping("/login")
//    public String signIn(String inputName, String inputPassword) {
////        log.info("id : {} , pw : {}", inputName, inputPassword);
//        Users users = this.users.findUsers(inputName, inputPassword);
//        if(users != null) {
//            return "redirect:/";
//        }
//        return "user/loginForm";
//    }



}
