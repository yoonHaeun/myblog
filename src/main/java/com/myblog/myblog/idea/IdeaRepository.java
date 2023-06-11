package com.myblog.myblog.idea;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by HaEun on 2023/06/01
 */
@Transactional(readOnly = true)
public interface IdeaRepository extends JpaRepository<Idea, Long> {
    Idea findAllByIdId(Long idId);
}
