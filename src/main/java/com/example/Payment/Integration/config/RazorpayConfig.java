package com.example.Payment.Integration.config;

import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@Component
@Configuration
public class RazorpayConfig {
    private String key;
    private String secret;
}
