package com.dhome.registermicroservice.contracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class RegisterUser {
    @TargetAggregateIdentifier
    private Long Id;
    private String Name;
    private String LastName;
    private Long Age;
    private Long DNI;
    private String Password;
    private String Username;
    private String Address;

}
