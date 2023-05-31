package com.myblog.myblog.data;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class RawData {

    @Id @GeneratedValue
    private Long id;

    private LocalDate transactionAt; // 거래일
    private String transactionType;  // 입 출금 여부
    private BigDecimal amount;       // 금액
    private String bankType;         // 은행 이름
    private String description;      // 설명

    private boolean classification; // 분류 여부


}
