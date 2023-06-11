package com.myblog.myblog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * Created by HaEun on 2023/06/11
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HobbyEnrollment {

//    @NotNull Long hoId;
    @NotNull String hoTitle;
    @NotNull String hoContext;
    @NotNull String hoDate;
}
