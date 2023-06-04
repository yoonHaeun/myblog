package com.myblog.myblog.tenant;

import com.myblog.myblog.company.Company;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *  세입자
 */
@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Tenant implements Serializable {

    private static final long serialVersionUID = 3085808150647711375L;
    @Id
    @GeneratedValue
    private Long id;
    private String roomNum; // 호실

    private LocalDate contractAt; // 계약 시작시점
    private LocalDate terminationAt; // 계약 종료시점

    @ManyToOne(fetch = FetchType.EAGER)
    private Company company;


}
