package com.system.DigitalBankingApplication.repository;

import com.system.DigitalBankingApplication.model.Account;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepo extends JpaRepository<Account,Integer> {

    @Query("from Account acc where acc.accountNumber=:accountNumber OR acc.phoneNumber=:phoneNumber")
    public List<Account> viewAccountDetailsByAccountNumberOrPhone(@Param("accountNumber") String accountNumber,
                                                                  @Param("phoneNumber") String phoneNumber);

    @Modifying
    @Transactional
    @Query("update Account acc set acc.accountName=:accountName,acc.address=:address,acc.email=:email,acc.phoneNumber=:phoneNumber")
    public void updateAccountByAccountNameAndPhone(@Param("accountName") String accountName,
                                                   @Param("phoneNumber") String phoneNumber,
                                                   @Param("email") String email,
                                                   @Param("address") String address

    );

}


//use JPQL OR NATIVE QUERY ,HQL OR NAMED QUERY