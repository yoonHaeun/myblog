package com.myblog.myblog.company;

import com.myblog.myblog.tenant.Tenant;
import com.myblog.myblog.tenant.TenantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;
    public List<Company> getCompanyList() {
        return companyRepository.findAll();
    }

    private final TenantRepository tenantRepository;
    public List<Tenant> getTenantList() {
        return tenantRepository.findAll();
    }



}
