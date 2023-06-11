package com.myblog.myblog.idea;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 *  세입자
 */
@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Idea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idId;

    private String idTitle; // 제목
    @Column(length = 10000)
    private String idContext; // 내용
    private LocalDate idDate; // 생성일자


}
