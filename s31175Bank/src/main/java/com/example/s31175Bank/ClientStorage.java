package com.example.s31175Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ClientStorage {
    ArrayList<Client> clients = new ArrayList<Client>();

    public Client addClient(String name) {
        int clientId;
        if (clients.isEmpty()) {
            clientId = 0;
        }
        else clientId = clients.toArray().length+1;

        Client client = new Client(clientId, name);
        clients.add(client);
        return client;
    }

    public Client getById(int id) {
        for (Client client : clients) {
            if(client.getId() == id) return client;
        }
        return null;
    }

}
