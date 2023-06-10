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
public class MemberEnrollment {
    @NotNull String id;
    @NotNull String password;
}
