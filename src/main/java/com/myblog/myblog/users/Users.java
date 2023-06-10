package com.myblog.myblog.users;

import com.myblog.myblog.diary.Diary;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Users{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Diary> diary;

}


