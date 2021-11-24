package com.dhome.registermicroservice.contracts.events;

import lombok.Value;

import java.util.Date;

@Value
public class PostValidated {
    private String postId;
    private String videoUrl;
    private String content;
    private Date uploadDate;
    private String employeeId;
}
