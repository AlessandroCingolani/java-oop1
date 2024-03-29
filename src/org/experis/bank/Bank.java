package org.experis.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // chiedo nome e cognome da passare nel costruttore
        System.out.print("Insert your name and surname to create count: ");
        String utentName = scan.nextLine();
        // creao nuovo account
        Conto account1 = new Conto(utentName);
        System.out.println("Account created welcome "+ account1.getUtentName());
        // condizione per loggato account
        boolean isLogged = true;
        do {
            // chiedo azione all utente
            System.out.println("Your balance: " + String.format("%.2f",account1.getBalance())+"€" );
            System.out.println("Choose operation:");
            System.out.println("Press 1 to withdraw");
            System.out.println("Press 2 to deposit");
            System.out.println("Press 3 to logout");
            int select = Integer.parseInt(scan.nextLine());
            switch (select){
                case 1 :
                    System.out.println("how much you want to withdraw?");
                    double amountWithdraw = Double.parseDouble(scan.nextLine());
                    account1.withdrawBudget(amountWithdraw);
                    break;
                    case 2 :
                    System.out.println("how much you want to deposit?");
                    double amountDeposit = Double.parseDouble(scan.nextLine());
                    account1.addBudget(amountDeposit);
                    break;
                    case 3 :
                    System.out.println("logout");
                    isLogged = false;
                    break;
            }
        }while(isLogged);

    }
}
