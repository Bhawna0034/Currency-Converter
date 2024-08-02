package com.bhawna.SpringBoot.Week4Task.Currency.Converter.auth;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {

        return Optional.of("Bhawna Sharma");
    }
}
