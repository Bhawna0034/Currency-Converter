package com.bhawna.SpringBoot.Week4Task.Currency.Converter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyConverterDTO {

    private Long id;
    private String fromCurrency;
    private String toCurrency;
    private Long amount;
}
