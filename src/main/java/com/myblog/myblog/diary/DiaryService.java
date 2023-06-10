package com.myblog.myblog.diary;

import com.myblog.myblog.dto.DiaryEnrollment;
import com.myblog.myblog.users.Users;
import com.myblog.myblog.users.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

/**
 * Created by HaEun on 2023/06/02
 */
@Service
@Transactional
@RequiredArgsConstructor
public class DiaryService {

    private final DiaryRepository diaryRepository;
    private final UsersRepository usersRepository;

    public List<Diary> diaryList(Long id){return diaryRepository.findAllById(Collections.singletonList(id));}

    public void createDiary(DiaryEnrollment e){
        Diary diary = new Diary();

        diary.setTitle(e.getTitle());
        diary.setContext(e.getContext());
        diary.setCreateDate(LocalDate.parse(e.getCreateDate()));

        Users users = usersRepository.findById(e.getUsersId()).orElseGet(Users::new);
        users.getDiary().add(diary);
        diary.setUsers(users);

        diaryRepository.save(diary);

    }
}
