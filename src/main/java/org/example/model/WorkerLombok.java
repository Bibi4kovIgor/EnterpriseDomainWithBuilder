package org.example.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.Instant;


@Builder
public class WorkerLombok {

    @NonNull private String firstName;
    @NonNull private String lastName;
    private String identity;
    private Position position;
    private Department department;
    @NonNull private String phone;
    private Instant birthdayDate;
    private Instant startWorkDate;
    private String account;

}
