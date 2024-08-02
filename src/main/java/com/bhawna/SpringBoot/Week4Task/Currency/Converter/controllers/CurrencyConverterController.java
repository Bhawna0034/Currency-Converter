package com.bhawna.SpringBoot.Week4Task.Currency.Converter.controllers;

import com.bhawna.SpringBoot.Week4Task.Currency.Converter.dto.CurrencyConverterDTO;
import com.bhawna.SpringBoot.Week4Task.Currency.Converter.services.CurrencyConverterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/convertCurrency")
public class CurrencyConverterController {

    private final CurrencyConverterService currencyConverterService;

    @GetMapping
    public CurrencyConverterDTO convertCurrency(@RequestParam String fromCurrency,
                                                @RequestParam String toCurrency,
                                                @RequestParam Long amount){
        return currencyConverterService.convertCurrency(fromCurrency,toCurrency,amount);
    }
}
