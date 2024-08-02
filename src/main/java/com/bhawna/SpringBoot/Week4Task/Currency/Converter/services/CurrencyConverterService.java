package com.bhawna.SpringBoot.Week4Task.Currency.Converter.services;

import com.bhawna.SpringBoot.Week4Task.Currency.Converter.dto.CurrencyConverterDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


public interface CurrencyConverterService {

    CurrencyConverterDTO convertCurrency(String fromCurrency, String toCurrency, Long amount);
}
