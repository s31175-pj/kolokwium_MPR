package com.example.s31175Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class TransactionStorage {
    AccountService accountService;

    ArrayList<Transaction> transactions = new ArrayList<>();

    public TransactionStorage(AccountService accountService) {
        this.accountService = accountService;

    }


    public Transaction deposit(int id, float amount) {
        return addTransaction(id, amount);
    }

    public Transaction send(int id, float amount) {
        return addTransaction(id, -amount);
    }

    private Transaction addTransaction(int id, float amount) {
        int transactionId;
        Account account = accountService.getByClientId(id);
        boolean success = canAdd(account, amount);
        String status;

        if (transactions.isEmpty()) {
            transactionId = 0;
        }
        else transactionId = transactions.toArray().length+1;

        if(success) {
            status = "ACCEPTED";
            account.deposit(amount);
        }
        else {
            status = "DECLINED";
        }

        Transaction transaction = new Transaction(transactionId, amount, status, account.getBalance()+amount);
        transactions.add(transaction);
        return transaction;
    }

    private boolean canAdd(Account account, float amount) {
        if(account == null) return false;
        if (account.getBalance()>=amount) {
            return true;
        };
        return false;
    };
}
