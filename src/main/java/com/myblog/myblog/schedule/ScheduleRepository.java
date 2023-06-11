package com.myblog.myblog.schedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by HaEun on 2023/06/01
 */
@Transactional(readOnly = true)
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    Schedule findAllByScId(Long scId);
}
