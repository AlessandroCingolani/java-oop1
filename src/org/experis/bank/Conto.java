package org.experis.bank;

import java.util.Random;

public class Conto {

    // Attributes
    private int countNumber;
    private String utentName;

    private double balance;

    // Constructors

    public Conto(String utentName) {
        this.utentName = utentName;
        balance = 0;
        Random random = new Random();
        this.countNumber = random.nextInt(1000)+1;
    }

    // Methods
    public String getUtentName(){
        return utentName;
    }  public String getBalance(){
        return String.format("%.2f",balance)+"€";
    }

    public double addBudget(double amount){
        return balance += amount;
    }
    public double withdrawBudget(double amount){
        double withdraw = balance - amount;
        if (withdraw < 0){
            System.out.println("Insufficient funds for the withdraw of " +  String.format("%.2f",amount)+"€");
        }else {
            balance = withdraw;
        }
        return balance;
    }
}
