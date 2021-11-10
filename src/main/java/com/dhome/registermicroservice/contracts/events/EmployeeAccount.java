package com.dhome.registermicroservice.contracts.events;

import lombok.Value;

import java.math.BigDecimal;
import java.time.Instant;

@Value
public class EmployeeAccount {
    private String employeeId;
    private String paymentId;
    private BigDecimal amount;
    private Instant occurredOn;
}
