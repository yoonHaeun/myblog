package com.myblog.myblog.member;

import com.myblog.myblog.diary.Diary;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @Column(name="member_id" , unique=true)
    private String id;
    private String password;

//    @OneToMany(fetch = FetchType.LAZY)
//    private List<Diary> Diary;

}


