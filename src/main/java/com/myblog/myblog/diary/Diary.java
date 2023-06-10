package com.myblog.myblog.diary;

import com.myblog.myblog.users.Users;
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
    private Long id;

    private String name;
    private String title; // 제목

    @Column(length = 5000)
    private String context; // 내용

    private LocalDate createDate; // 생성일자

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users users;


}
