package com.myblog.myblog.hobby;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 *  세입자
 */
@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hoId;

    private String hoTitle; // 제목
    @Column(length = 10000)
    private String hoContext; // 내용
    private LocalDate hoDate; // 생성일자

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "member_id")
//    private Member member;


}
