package com.myblog.myblog.company;

import com.myblog.myblog.tenant.Tenant;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private List<Tenant> tenants;
}


