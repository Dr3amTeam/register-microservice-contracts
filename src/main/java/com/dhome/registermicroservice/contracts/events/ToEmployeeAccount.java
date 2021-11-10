package com.dhome.registermicroservice.contracts.events;

import java.math.BigDecimal;
import java.time.Instant;

public class ToEmployeeAccount {
    private String employeeId;
    private String transactionId;
    private BigDecimal amount;
    private Instant occurredOn;
}
