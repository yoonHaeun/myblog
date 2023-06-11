package com.myblog.myblog.notice;


import com.myblog.myblog.dto.NoticeEnrollment;
import com.myblog.myblog.dto.ScheduleEnrollment;
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
public class NoticeService {

    private final NoticeRepository noticeRepository;

    public List<Notice> noticeList(){return noticeRepository.findAll();}

    public Notice currentNotice(Long noId){return noticeRepository.findAllByNoId(noId);}

    public void createNotice(NoticeEnrollment e) {
        Notice notice = new Notice();

        notice.setNoId(null);
        notice.setNoTitle(e.getNoTitle());
        notice.setNoContext(e.getNoContext());
        notice.setNoDate(LocalDate.now());

        noticeRepository.save(notice);
    }

}
