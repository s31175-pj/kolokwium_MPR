package com.example.s31175Bank;

public class Transaction {
    private int id;
    private float amount;
    private String status;
    private float newBalance;

    public Transaction(int id, float amount, String status, float newBalance) {
        this.id = id;
        this.amount = amount;
        this.status = status;
        this.newBalance = newBalance;
    }

    public int getId() {
        return id;
    }
    public float getAmount() {
        return amount;
    }
    public String getStatus() {
        return status;
    }
    public float getNewBalance() {
        return newBalance;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public void setNewBalance(float newBalance) {
        this.newBalance = newBalance;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
