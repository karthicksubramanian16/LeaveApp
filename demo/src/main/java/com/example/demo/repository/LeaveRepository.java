package com.example.leaveapp.repository;

import com.example.leaveapp.model.LeaveApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<LeaveApplication, Long> {
}
