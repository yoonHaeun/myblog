package com.myblog.myblog.company;

import com.myblog.myblog.tenant.Tenant;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Company implements Serializable {

    private static final long serialVersionUID = -469689400960112067L;

    @Id
    @GeneratedValue
    private Long id;

    private String companyName;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Tenant> tenants;

    public void addTenant(Tenant tenant){
        this.getTenants().add(tenant);
        tenant.setCompany(this);
    }

}


