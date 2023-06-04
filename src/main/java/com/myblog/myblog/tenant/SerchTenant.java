package com.myblog.myblog.tenant;

import com.myblog.myblog.company.Company;
import lombok.Data;

import java.time.LocalDate;

/**
 * Created by HaEun on 2023/06/02
 */
@Data
public class SerchTenant {
    Long id;
    String roomNum;
    LocalDate contractAt; // 계약 시작시점
    LocalDate terminationAt; // 계약 종료시점
    Company company;

}
