package com.school.fee.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;
    private double amount;
    private LocalDateTime dateTime;

    public Payment() {}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
