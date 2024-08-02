package com.bhawna.SpringBoot.Week4Task.Currency.Converter.services;

import com.bhawna.SpringBoot.Week4Task.Currency.Converter.advices.ApiResponse;
import com.bhawna.SpringBoot.Week4Task.Currency.Converter.dto.CurrencyConverterDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CurrencyConverterImpl implements CurrencyConverterService {

    @Value("${freecurrencyapi.api-key}")
    private String API_KEY;

    private final RestClient restClient;
    @Override
  public CurrencyConverterDTO convertCurrency(String fromCurrency, String toCurrency, Long amount) {


        String url = String.format("?apikey=%s&base_currency=%s&currencies=%s", API_KEY, fromCurrency, toCurrency);
        try {
           ApiResponse<CurrencyConverterDTO> currencyConverterDTOApiResponse = restClient.get()
                                                                         .uri(url)
                                                                         .retrieve()
                                                                         .onStatus(HttpStatusCode::is4xxClientError, ((request, response) -> {
                                                                         throw new RuntimeException("Could not get all the employee");
                                                                           })).body(new ParameterizedTypeReference<>() {

                                                                           });

            return currencyConverterDTOApiResponse.getData();

        } catch (Exception e) {
         throw new RuntimeException(e);
        }

      }

}
