package com.example.s31175Bank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TransactionServiceTest {

    @Autowired
    TransactionService transactionService;

    @Autowired
    AccountService accountService;

    @Autowired
    ClientService clientService;

    @Test
    void testTransactionService() {

        System.out.println("test");

        accountService.registerClient("Piotr",456.12f);
//        deposit(0, 15.12f);
        System.out.println(accountService.getByClientId(0).getBalance());

//        send(0, 22.22f);
        System.out.println(accountService.getByClientId(0).getBalance());

        System.out.println(accountService.getById(0).getClient().getName());
    }


}