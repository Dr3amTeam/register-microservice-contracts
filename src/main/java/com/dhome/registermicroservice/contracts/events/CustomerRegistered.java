package com.dhome.registermicroservice.contracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class CustomerRegistered {
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
    private Instant occurredOn;
}