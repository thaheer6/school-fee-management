package com.school.fee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private Long studentId;
    private String name;
    private String parentName;
    private String className;
    private String mobile;
    private double totalFee;
    private double balanceFee;

    public Student() {}

    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getParentName() { return parentName; }
    public void setParentName(String parentName) { this.parentName = parentName; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public double getTotalFee() { return totalFee; }
    public void setTotalFee(double totalFee) { this.totalFee = totalFee; }

    public double getBalanceFee() { return balanceFee; }
    public void setBalanceFee(double balanceFee) { this.balanceFee = balanceFee; }
}
