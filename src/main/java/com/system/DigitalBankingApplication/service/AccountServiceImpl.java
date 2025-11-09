package com.system.DigitalBankingApplication.service;

import com.system.DigitalBankingApplication.model.Account;
import com.system.DigitalBankingApplication.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    AccountRepo accountRepo;

    @Override
    public void createAccount(Account account) {
        accountRepo.save(account);

    }

    @Override
    public void updateAccountByAccountNameAndPhone(String accountName,String phoneNumber,String email,String address) {
        accountRepo.updateAccountByAccountNameAndPhone(accountName,phoneNumber,email,address);
    }


    @Override
    public void deleteAccountByAccountNumberOrAccountName(String accountNumber, String accountName) {

    }

    @Override
    public List<Account> viewAccountDetailsByAccountNumberOrPhone(String accountNumber,String phone) {
        return accountRepo.viewAccountDetailsByAccountNumberOrPhone(accountNumber,phone);
    }
}
