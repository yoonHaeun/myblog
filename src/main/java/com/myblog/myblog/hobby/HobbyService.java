package com.myblog.myblog.hobby;


import com.myblog.myblog.dto.DiaryEnrollment;
import com.myblog.myblog.dto.HobbyEnrollment;
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
public class HobbyService {

    private final HobbyRepository hobbyRepository;

    public List<Hobby> hobbyList(){return hobbyRepository.findAll();}

    public Hobby currentHobby(LocalDate hoDate){return hobbyRepository.findAllByHoDate(hoDate);}

    public void createHobby(HobbyEnrollment e) {
        Hobby hobby = new Hobby();

        hobby.setHoId(null);
        hobby.setHoTitle(e.getHoTitle());
        hobby.setHoContext(e.getHoContext());
        hobby.setHoDate(LocalDate.now());

        hobbyRepository.save(hobby);
    }

    public void updateHobby(Long hoId, String hoTitle, String hoContext){
        Hobby hobby = hobbyRepository.findAllByHoId(hoId);
        hobby.setHoTitle(hoTitle);
        hobby.setHoContext(hoContext);
        hobbyRepository.save(hobby);
    }

}
