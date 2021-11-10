package com.dhome.registermicroservice.contracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class FromAccountNotFound {
    private String accountId;
    private String paymentId;
    private Instant ocurredOn;
}
