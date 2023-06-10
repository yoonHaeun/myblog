package com.myblog.myblog.dto;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by HaEun on 2023/06/02
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsersEnrollment {
    @NotNull Long id;
    @NotNull String name;
    @NotNull String password;
}
