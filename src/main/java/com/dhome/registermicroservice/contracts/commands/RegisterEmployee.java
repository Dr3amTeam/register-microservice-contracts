package com.dhome.registermicroservice.contracts.commands;

import com.dhome.registermicroservice.contracts.others.Office;
import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

@Value
public class RegisterEmployee {
    @TargetAggregateIdentifier
    private String accountId;
    private String name;
    private String lastname;
    private String age;
    private String phone;
    private String dni;
    private String email;
    private String password;
    private String username;
    private String address;
    private boolean verify;
    private BigDecimal balance;
    private Office office;

}
