package com.myblog.myblog.schedule;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 *  세입자
 */
@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scId;

    private String scTitle; // 제목
    @Column(length = 10000)
    private String scContext; // 내용
    private LocalDate scDate; // 생성일자


}
