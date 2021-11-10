package com.dhome.registermicroservice.contracts.events;

import lombok.Value;

import java.math.BigDecimal;
import java.time.Instant;

@Value
public class ToEmployeeAccount {
    private String employeeId;
    private String transactionId;
    private BigDecimal amount;
    private Instant occurredOn;
}
