package com.example.leaveapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LeaveApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private String name;
    private String department;
    private String leaveType;
    private String startDate;
    private String endDate;
    private String reason;

    // Getters and Setters
    // ...
}
