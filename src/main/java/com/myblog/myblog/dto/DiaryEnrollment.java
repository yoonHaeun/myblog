package com.myblog.myblog.dto;

import com.myblog.myblog.users.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * Created by HaEun on 2023/06/02
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiaryEnrollment {
    @NotNull Long usersId;

    @NotNull String title;
    @NotNull String context;
    @NotNull String createDate;

}
