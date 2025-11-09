package com.system.DigitalBankingApplication.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Banking_Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer transactionId;
    private String toAccountNumber;
    private String fromAccountNumber;
    private Double amount;
    private String toAccountEmail;
    private String fromAccountEmail;
    private String toAccountPhone;
    private String fromAccountPhone;
    private LocalDateTime localDateTime;

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }

    public void setToAccountNumber(String toAccountNumber) {
        this.toAccountNumber = toAccountNumber;
    }

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getToAccountEmail() {
        return toAccountEmail;
    }

    public void setToAccountEmail(String toAccountEmail) {
        this.toAccountEmail = toAccountEmail;
    }

    public String getFromAccountEmail() {
        return fromAccountEmail;
    }

    public void setFromAccountEmail(String fromAccountEmail) {
        this.fromAccountEmail = fromAccountEmail;
    }

    public String getToAccountPhone() {
        return toAccountPhone;
    }

    public void setToAccountPhone(String toAccountPhone) {
        this.toAccountPhone = toAccountPhone;
    }

    public String getFromAccountPhone() {
        return fromAccountPhone;
    }

    public void setFromAccountPhone(String fromAccountPhone) {
        this.fromAccountPhone = fromAccountPhone;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}

//save user create account,update,delete account ,pin change
//transaction -> transfer amount, report ,mini statement
//report transaction pdf /excel bank statement generation