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
public class NoticeEnrollment {
    @NotNull String noTitle;
    @NotNull String noContext;
    @NotNull String noDate;

//    @NotNull Long memberSeq;
}
