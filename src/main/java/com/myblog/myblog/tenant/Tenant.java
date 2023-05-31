package com.myblog.myblog.tenant;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 *  세입자
 */
@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Tenant {

    @Id
    @GeneratedValue
    private Long id;
    private String roomNum; // 호실

    private LocalDate contractAt; // 계약 시작시점
    private LocalDate terminationAt; // 계약 종료시점


}
