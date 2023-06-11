package com.myblog.myblog.schedule;


import com.myblog.myblog.dto.DiaryEnrollment;
import com.myblog.myblog.dto.ScheduleEnrollment;
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
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public List<Schedule> scheduleList(){return scheduleRepository.findAll();}

    public Schedule currentSchedule(Long scId){return scheduleRepository.findAllByScId(scId);}

    public void createSchedule(ScheduleEnrollment e) {
        Schedule schedule = new Schedule();

        schedule.setScId(null);
        schedule.setScTitle(e.getScTitle());
        schedule.setScContext(e.getScContext());
        schedule.setScDate(LocalDate.now());

        scheduleRepository.save(schedule);
    }

}
