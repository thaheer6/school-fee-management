package com.school.fee.controller;

import com.school.fee.entity.Payment;
import com.school.fee.entity.Student;
import com.school.fee.repository.PaymentRepository;
import com.school.fee.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentRepository payRepo;
    private final StudentRepository studentRepo;

    public PaymentController(PaymentRepository payRepo, StudentRepository studentRepo) {
        this.payRepo = payRepo;
        this.studentRepo = studentRepo;
    }

    // Save payment (called from frontend)
    @PostMapping
    public Payment makePayment(@RequestBody Payment payment) {

        Student s = studentRepo.findById(payment.getStudentId()).orElse(null);
        if (s == null) return null;

        // update student balance
        s.setBalanceFee(s.getBalanceFee() - payment.getAmount());
        studentRepo.save(s);

        // set date & time
        payment.setDateTime(LocalDateTime.now());

        return payRepo.save(payment);
    }

    // Get payment history of a student
    @GetMapping("/student/{id}")
    public List<Payment> getPaymentsByStudent(@PathVariable Long id) {
        return payRepo.findByStudentId(id);
    }
}
