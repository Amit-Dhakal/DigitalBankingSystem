package com.system.DigitalBankingApplication.service;

import com.system.DigitalBankingApplication.model.Account;

import java.util.List;

public interface AccountService {
public void createAccount(Account account);
public void updateAccountByAccountNameAndPhone(String accountName,String phoneNumber,String email,String address);
public void deleteAccountByAccountNumberOrAccountName(String accountNumber,String accountName);
public List<Account> viewAccountDetailsByAccountNumberOrPhone(String accountNumber,String phone);

}
