package com.myblog.myblog.diary;

import com.myblog.myblog.member.Member;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 *  세입자
 */
@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long diId;

    private String diTitle; // 제목
    @Column(length = 10000)
    private String diContext; // 내용
    private LocalDate diDate; // 생성일자

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "member_id")
//    private Member member;


}
