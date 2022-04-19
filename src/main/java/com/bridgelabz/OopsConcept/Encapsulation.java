package com.bridgelabz.OopsConcept;

public class Encapsulation {
    public static void main(String[] args) {
        //Data-hiding
        Account account = new Account();
        System.out.println(account.getBalance(1311));
    }
}
//Encapsulation
class Account{
    //Data-hiding
    private int balance;
    private int atmPin;

    public Account() {
        this.balance = 1232;
        this.atmPin = 1111;
    }
    //Abstraction
    public int getBalance(int atmPin){
        if (atmPin == this.atmPin){
            return balance;
        }
        throw new RuntimeException("Invalid user");
    }
}