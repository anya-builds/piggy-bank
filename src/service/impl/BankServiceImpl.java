package service.impl;

import domain.Account;
import repository.AccountRepository;
import service.BankService;

import java.util.UUID;

public class BankServiceImpl implements BankService {
    private final AccountRepository accountRepository = new AccountRepository();


    @Override
    public String openAccount(String name, String email, String accountType) {
        String customerId = UUID.randomUUID().toString();

//        String accountNumber = UUID.randomUUID().toString();
//        int temp = accountRepository.findAll().size()+1;
        String accountNumber = getAccountNumber();
        Account account=new Account(accountNumber, accountType,(double)0,customerId);
        // save
        accountRepository.save(account);
        return accountNumber;
    }
    private String getAccountNumber(){
        int size = accountRepository.findAll().size()+1;
        return String.format("AC%06d",size);
    }
}
