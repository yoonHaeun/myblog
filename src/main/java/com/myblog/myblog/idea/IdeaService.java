package com.myblog.myblog.idea;


import com.myblog.myblog.dto.IdeaEnrollment;
import com.myblog.myblog.dto.NoticeEnrollment;
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
public class IdeaService {

    private final IdeaRepository ideaRepository;

    public List<Idea> ideaList(){return ideaRepository.findAll();}

    public Idea currentIdea(Long idId){return ideaRepository.findAllByIdId(idId);}

    public void createIdea(IdeaEnrollment e) {
        Idea idea = new Idea();

        idea.setIdId(null);
        idea.setIdTitle(e.getIdTitle());
        idea.setIdContext(e.getIdContext());
        idea.setIdDate(LocalDate.now());

        ideaRepository.save(idea);
    }

}
