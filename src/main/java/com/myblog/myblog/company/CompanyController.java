package com.myblog.myblog.company;

import com.myblog.myblog.tenant.SerchTenant;
import com.myblog.myblog.tenant.Tenant;
import com.myblog.myblog.tenant.TenantDTO;
import com.myblog.myblog.tenant.TenantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;
    private final CompanyRepository companyRepository;
    private final TenantRepository tenantRepository;

    @GetMapping("/company-list")
    public String viewCompanyList(Model model){
        List<Company> companyList = companyRepository.findAll();
//        String text = StringUtils.join(companyList,",");
        String text = companyList.toString();
        model.addAttribute("companyList", companyList);
        model.addAttribute("text",text);
//        Tenant tenant = new Tenant();
//        tenant.getRoomNum();
//        model.addAttribute("tenantList", tenantList);
        return "company/companyList";
    }

//    @GetMapping("/list")
//    public ResponseEntity<TenantDTO> dmdkdkdkdk() {
//        SerchTenant serchTenant = new SerchTenant();
//        serchTenant.setCompany(CompanyService.findall());
//    }




    public void insertCompany(){
        Company company = Company.builder().id(null).build();
        companyRepository.save(company);
    }



}
