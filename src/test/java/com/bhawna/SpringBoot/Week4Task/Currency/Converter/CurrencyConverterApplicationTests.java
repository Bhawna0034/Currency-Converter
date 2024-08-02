package com.bhawna.SpringBoot.Week4Task.Currency.Converter;

import com.bhawna.SpringBoot.Week4Task.Currency.Converter.dto.CurrencyConverterDTO;
import com.bhawna.SpringBoot.Week4Task.Currency.Converter.services.CurrencyConverterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CurrencyConverterApplicationTests {

    @Autowired
	CurrencyConverterService currencyConverterService;

	@Test
	void convertCurrencyTests(){
		CurrencyConverterDTO currencyConverterDTO = currencyConverterService.convertCurrency("INR", "USD", 500L);
		System.out.println(currencyConverterDTO);

	}
}
