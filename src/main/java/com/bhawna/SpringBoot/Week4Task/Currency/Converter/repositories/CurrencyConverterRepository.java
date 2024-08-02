package com.bhawna.SpringBoot.Week4Task.Currency.Converter.repositories;

import com.bhawna.SpringBoot.Week4Task.Currency.Converter.entities.CurrencyConverterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyConverterRepository extends JpaRepository<CurrencyConverterEntity, Long> {
}
