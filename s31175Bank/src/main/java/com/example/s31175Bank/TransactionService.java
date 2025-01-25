package com.example.s31175Bank;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    TransactionStorage transactionStorage;
    AccountService accountService;

    public TransactionService(TransactionStorage transactionStorage, AccountService accountService) {
        this.transactionStorage = transactionStorage;
        this.accountService = accountService;

//        System.out.println("test");
//
//        accountService.registerClient("Piotr",456.12f);
//        deposit(0, 15.12f);
//        System.out.println(accountService.getByClientId(0).getBalance());
//
//        send(0, 22.22f);
//        System.out.println(accountService.getByClientId(0).getBalance());
//
//        System.out.println(accountService.getById(0).getClient().getName());
    }


    public Transaction deposit(int id, float amount) {
        return transactionStorage.deposit(id, amount);
    }

    public Transaction send(int id, float amount) {
        return transactionStorage.send(id, amount);
    }
}
