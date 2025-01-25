package com.example.s31175Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AccountStorage {
    ClientService clientService;

    ArrayList<Account> accounts = new ArrayList<>();

    public AccountStorage(ClientService clientService) {
        this.clientService = clientService;
    }

    public void registerClient(String name, float balance) {
        Client client = clientService.addClient(name);
        registerAccount(client, balance);
    }

    private void registerAccount(Client client, float balance) {
        int accountId;
        if (accounts.isEmpty()) {
            accountId = 0;
        }
        else accountId = accounts.toArray().length+1;

        Account account = new Account(accountId, client, balance);
        accounts.add(account);
    }

    public Account getById(int id) {
        for (Account account : accounts) {
            if(account.getId() == id) return account;
        }
        return null;
    }

    public Account getByClientId(int id) {
        for (Account account : accounts) {
            if(account.getClient().getId() == id) return account;
        }
        return null;
    }
}
