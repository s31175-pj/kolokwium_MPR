package com.example.s31175Bank;


public class Account {
    private int id;
    private Client client;
    private float balance;



    public Account(int id, Client client, float balance) {
        this.id = id;
        this.client = client;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public Client getClient() {
        return this.client;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(float amount) {
        this.balance += amount;
    }
}
