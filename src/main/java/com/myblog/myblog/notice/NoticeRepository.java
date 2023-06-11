package com.myblog.myblog.notice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by HaEun on 2023/06/01
 */
@Transactional(readOnly = true)
public interface NoticeRepository extends JpaRepository<Notice, Long> {
    Notice findAllByNoId(Long noId);
}
