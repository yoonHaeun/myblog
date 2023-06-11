package com.myblog.myblog.hobby;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

/**
 * Created by HaEun on 2023/06/01
 */
@Transactional(readOnly = true)
public interface HobbyRepository extends JpaRepository<Hobby, Long> {
    Hobby findAllByHoId(Long hoId);
    Hobby findAllByHoDate(LocalDate hoDate);
}
