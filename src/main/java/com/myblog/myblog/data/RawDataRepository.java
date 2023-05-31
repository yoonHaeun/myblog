package com.myblog.myblog.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface RawDataRepository extends JpaRepository<RawData, Long> {

    List<RawData> findAllByClassificationIsFalse();
}
