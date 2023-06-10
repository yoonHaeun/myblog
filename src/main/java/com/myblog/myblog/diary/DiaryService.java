package com.myblog.myblog.diary;


import com.myblog.myblog.dto.DiaryEnrollment;
import com.myblog.myblog.member.Member;
import com.myblog.myblog.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by HaEun on 2023/06/02
 */
@Service
@Transactional
@RequiredArgsConstructor
public class DiaryService {

    private final DiaryRepository diaryRepository;
    private final MemberRepository memberRepository;

    public List<Diary> diaryList(){return diaryRepository.findAll();}

    public Diary currentDiary(Long diId){return diaryRepository.findAllBydiId(diId);}

    public void createDiary(DiaryEnrollment e) {
        Diary diary = new Diary();

        diary.setDiId(null);
        diary.setDiTitle(e.getDiTitle());
        diary.setDiContext(e.getDiContext());
        diary.setDiDate(LocalDate.now());

//        Member member = memberRepository.findById(e.getMemberSeq()).orElseGet(Member::new);
//        member.getDiary().add(diary);
//        diary.setMember(member);

        diaryRepository.save(diary);
    }

//    public void updateSuite(Long diId, String title, String context){
//        MyDiary myDiary = myDiaryRepository.findAllBydiId(diId);
//        myDiary.setDiTitle(title);
//        myDiary.setDiContext(context);
//        myDiaryRepository.save(myDiary);
//    }

}
