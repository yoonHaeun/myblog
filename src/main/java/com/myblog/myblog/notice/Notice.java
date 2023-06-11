package com.myblog.myblog.notice;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 *  세입자
 */
@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noId;

    private String noTitle; // 제목
    @Column(length = 10000)
    private String noContext; // 내용
    private LocalDate noDate; // 생성일자


}
