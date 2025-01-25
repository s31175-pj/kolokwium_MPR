package com.example.s31175Bank;

import org.springframework.stereotype.Service;

@Service
public class ClientService {
    ClientStorage clientStorage;
    public ClientService(ClientStorage clientStorage) {
        this.clientStorage = clientStorage;
    }

    public Client addClient(String name) {
        return clientStorage.addClient(name);
    }

    public Client getById(int id) {
        return clientStorage.getById(id);
    }
}
