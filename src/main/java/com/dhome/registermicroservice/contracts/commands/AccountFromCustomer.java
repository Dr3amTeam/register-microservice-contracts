package com.dhome.registermicroservice.contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

@Value
public class AccountFromCustomer {
    @TargetAggregateIdentifier
    private String customerId;
    private String paymentId;
    private BigDecimal amount;
}
