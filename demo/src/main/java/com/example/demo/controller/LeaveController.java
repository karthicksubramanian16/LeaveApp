package com.example.leaveapp.controller;

import com.example.leaveapp.model.LeaveApplication;
import com.example.leaveapp.repository.LeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/leave")
public class LeaveController {

    @Autowired
    private LeaveRepository leaveRepository;

    @PostMapping
    public ResponseEntity<String> submitLeaveApplication(@RequestBody LeaveApplication leaveApplication) {
        leaveRepository.save(leaveApplication);
        return ResponseEntity.ok("Leave application submitted successfully!");
    }
}
