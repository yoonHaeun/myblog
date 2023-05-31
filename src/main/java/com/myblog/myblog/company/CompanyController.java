package com.myblog.myblog.company;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;
    private final CompanyRepository companyRepository;

    @GetMapping("/company-list")
    public String viewCompanyList(Model model){
        List<Company> companyList = companyRepository.findAll();
        model.addAttribute("companyList", companyList);

        return "company/companyList";
    }
}
