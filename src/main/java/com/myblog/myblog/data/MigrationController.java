package com.myblog.myblog.data;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MigrationController {

    private final RawDataRepository rawDataRepository;

    @GetMapping("/migration")
    public String migrationHome(Model model){

        List<RawData> rawData = rawDataRepository.findAllByClassificationIsFalse();
        model.addAttribute("rawData",rawData);

        return "migration/migration";
    }


}
