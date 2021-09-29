package com.dhome.registermicroservice.contracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class UserEdited {
    private Long Id;
    private String Name;
    private String LastName;
    private Long Age;
    private Long DNI;
    private String Password;
    private String Username;
    private String Address;
    private Instant occurredOn;
}
