package com.school.fee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.school.fee.entity.Payment;
import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByStudentId(Long studentId);
}
