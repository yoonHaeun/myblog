package com.myblog.myblog.diary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by HaEun on 2023/06/01
 */
@Transactional(readOnly = true)
public interface DiaryRepository extends JpaRepository<Diary, Long> {
    Diary findAllBydiId(Long diId);
}
