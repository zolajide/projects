/*
* Name: Zainab Olajide
* Date : 4/7/2025
* Description : Uses the Account class to
simulate an ATM machine
*/
package Homework9;
import java.util.*;

public class ATMMachine {

    public static void main(String[] args) {
        int userid = 0;
        int userchoice = 0;
        boolean found = false;
        Account[] accounts = new Account[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
            accounts[i].setId(i);
        }

        while (!found) {
            System.out.print("Enter an id: ");
            userid = input.nextInt();

            if (userid >= 0 && userid < 10) {
                Account useraccount = accounts[userid];
                found = true;

                while (true) {
                    System.out.print("Main menu \n 1: check balance \n 2: withdraw \n 3: deposit \n 4: exit \n Enter a choice: ");
                    userchoice = input.nextInt();

                    if (userchoice == 1) {
                        double userbalance = useraccount.getBalance();
                        System.out.println("Your balance is: " + userbalance);
                    } else if (userchoice == 2) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawamount = input.nextDouble();
                        useraccount.withdraw(withdrawamount);
                    } else if (userchoice == 3) {
                        System.out.print("Enter amount to deposit: ");
                        double depositamount = input.nextDouble();
                        useraccount.deposit(depositamount);
                    } else if (userchoice == 4) {
                        System.out.println("Exiting...");
                        break;
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                }
            } else {
                System.out.println("Wrong id, Reenter: ");
            }
        }
    }
}
