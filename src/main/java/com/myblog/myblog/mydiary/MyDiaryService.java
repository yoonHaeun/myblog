package com.myblog.myblog.mydiary;

import com.myblog.myblog.dto.MyDiaryEnrollment;
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
public class MyDiaryService {

    private final MyDiaryRepository myDiaryRepository;
    private final MemberRepository memberRepository;

    public List<MyDiary> diaryList(){return myDiaryRepository.findAll();}
    public MyDiary currentDiary(Long diId){return myDiaryRepository.findAllBydiId(diId);}

    public void createDiary(MyDiaryEnrollment e) {
        MyDiary myDiary = new MyDiary();

        myDiary.setDiId(null);
        myDiary.setDiTitle(e.getTitle());
        myDiary.setDiContext(e.getContext());
        myDiary.setDiDate(LocalDate.now());

        Member member = memberRepository.findById(e.getMemberId()).orElseGet(Member::new);
        member.getMyDiary().add(myDiary);
        myDiary.setMember(member);

        myDiaryRepository.save(myDiary);
    }

    public void updateSuite(Long diId, String title, String context){
        MyDiary myDiary = myDiaryRepository.findAllBydiId(diId);
        myDiary.setDiTitle(title);
        myDiary.setDiContext(context);
        myDiaryRepository.save(myDiary);
    }

}
