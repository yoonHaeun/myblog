package com.myblog.myblog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * Created by HaEun on 2023/06/10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IdeaEnrollment {
    @NotNull String idTitle;
    @NotNull String idContext;
    @NotNull String idDate;

//    @NotNull Long memberSeq;
}
