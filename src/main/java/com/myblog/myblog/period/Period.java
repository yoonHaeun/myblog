package com.myblog.myblog.period;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Getter @Setter @EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Period {

    @Id
    @GeneratedValue
    private Long id;

    private BigDecimal paymentOfFee;  // 실제 납부한 월세
    private BigDecimal contractOfFee; // 계약한 월세

    private LocalDate startAt;
    private LocalDate endAt;

    private boolean whetherToPay;     // 납부 여부

}
