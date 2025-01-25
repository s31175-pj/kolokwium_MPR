package com.example.s31175Bank;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
    AccountStorage accountStorage;

    public AccountService(AccountStorage accountStorage) {
        this.accountStorage = accountStorage;
    }

    public void registerClient(String name, float balance) {
        accountStorage.registerClient(name,balance);
    }

    public Account getById(int id) {
        return accountStorage.getById(id);
    }

    public Account getByClientId(int id) {
        return accountStorage.getByClientId(id);
    }

}
