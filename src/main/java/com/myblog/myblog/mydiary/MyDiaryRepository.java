package com.myblog.myblog.mydiary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by HaEun on 2023/06/01
 */
@Transactional(readOnly = true)
public interface MyDiaryRepository extends JpaRepository<MyDiary, Long> {
    MyDiary findAllBydiId(Long diId);
}
