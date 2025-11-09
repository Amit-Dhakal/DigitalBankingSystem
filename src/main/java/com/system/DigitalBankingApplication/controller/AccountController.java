package com.system.DigitalBankingApplication.controller;

import com.system.DigitalBankingApplication.model.Account;
import com.system.DigitalBankingApplication.repository.AccountRepo;
import com.system.DigitalBankingApplication.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @Autowired
    AccountRepo accountRepo;

    @GetMapping("/create-account")
    public String registerAccount(Model model){
        return "register";
    }
    @PostMapping("/create-account")
    public String registerAccount(@ModelAttribute Account account,Model model){
        account.setAccountName(account.getAccountName());
        account.setPhoneNumber(account.getPhoneNumber());
        account.setEmail(account.getEmail());
        account.setAddress(account.getAddress());
        account.setAccountNumber(generateAccountNumber());
        accountService.createAccount(account);
        return "register";
    }

    @GetMapping("/update-account")
    public String updateAccount(@RequestParam(required = false) String phoneNumber,
                                @RequestParam(required = false) String accountNumber,Model model){
        List<Account> fetchAccount=accountService.viewAccountDetailsByAccountNumberOrPhone(accountNumber,phoneNumber);
        System.out.println("Inside GET");
        System.out.println(fetchAccount);
        model.addAttribute("fetchAccount",fetchAccount);
        return "update";
    }
    @PostMapping("/update-account")
    public String updateAccountByAccountNameAndPhone(@RequestParam("accountName") String accountName,
                                                     @RequestParam("phoneNumber") String phoneNumber,
                                                     @RequestParam("email") String email,
                                                     @RequestParam("address") String address,
                                                            Model model){
        accountService.updateAccountByAccountNameAndPhone(accountName,phoneNumber,email,address);
        System.out.println("Account is updated");
        return "update";
    }

    @GetMapping("/fetch-account")
    public String findAllAccount(Model model){
        List<Account> accountList=accountRepo.findAll();
        model.addAttribute("accountList",accountList);
        return "viewData";
    }

    private String generateAccountNumber(){
        StringBuilder accountNumber=new StringBuilder();
        Random rand=new Random();
        for(int i=0;i<16;i++){
           int digit = rand.nextInt(9); //0-9
            accountNumber.append(digit);
        }
        return accountNumber.toString();
    }

}




//account details
//transaction