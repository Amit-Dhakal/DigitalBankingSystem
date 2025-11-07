package com.system.DigitalBankingApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String accountName;
    private String address;
    private String email;
    private String phoneNumber;
    private LocalDateTime transactionDate;

}
