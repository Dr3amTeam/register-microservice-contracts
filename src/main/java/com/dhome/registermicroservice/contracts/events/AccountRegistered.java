package com.dhome.registermicroservice.contracts.events;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.time.Instant;

@Value
public class AccountRegistered {
    private String accountId;
    private String username;
    private String password;
    private boolean verify;
    private Instant occurredOn;
}
