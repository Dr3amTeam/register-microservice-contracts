package com.dhome.registermicroservice.contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class RegisterAccount {
    @TargetAggregateIdentifier
    private String accountId;
    private String username;
    private String password;
    private boolean verify;
}
