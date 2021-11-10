package com.dhome.registermicroservice.contracts.events;

import com.dhome.registermicroservice.contracts.others.Office;
import lombok.Value;

import java.math.BigDecimal;
import java.time.Instant;

@Value
public class EmployeeRegistered {
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
    private Instant occurredOn;
    private Office office;
}
