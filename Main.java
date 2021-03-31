import java.util.Scanner;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Boolean Menu = true;
    int menuchoice;
    int PIN;
    int PIN2;
    double transaction;
    String accname;

    Scanner scan = new Scanner(System.in);

    while(Menu) // While the boolean variable Menu (yes/no) is true the menu will run
      {
        System.out.println("============================================"); // Menu display
        System.out.println("Welcome to College Park Bank");
        System.out.println("Imput one of the following options:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balance");
        System.out.println("4. Open account");
        System.out.println("5. Close account");
        System.out.println("6. Transfer");
        System.out.println("7. Quit menu");
        System.out.println("============================================");
        menuchoice = scan.nextInt(); //stores the users imput on menu choice

      switch(menuchoice) //Allows you to choose one of the menu otions
        {
          case 1: //Deposit
            System.out.println("Please imput your account PIN"); //Deposit money
            PIN = scan.nextInt();
            System.out.println("How much money would u like to deposit?"); //Deposit money
            transaction = scan.nextDouble();
            Account.Deposit(PIN, transaction);
            break;


          case 2: //Withraw 
            System.out.println("Please imput your account PIN"); //Withraw money
            PIN = scan.nextInt();
            System.out.println("How much money would u like to deposit?"); //Deposit money
            transaction = scan.nextDouble();
            Account.Withdraw(PIN, transaction);
            break;


          case 3: // Balance
            System.out.println("Please imput your account PIN"); //check balance money
            PIN = scan.nextInt();
            System.out.println("=============================");
            Account.printacc(PIN);
            break;
         //   System.out.println("Account name: "+ (Account.printacc(PIN))                );
            //System.out.println("Account name: "+ (accarray.Get(Account.searchPIN(PIN))).printacc());
           // System.out.println("Account name: "+(Account.searchPIN(PIN)));


          case 4: // Create an acc

            System.out.println("Please enter a new account name"); //asks for new acc name
            accname = scan.next();

            System.out.println("Please enter a new PIN"); // 4 number pin
            PIN = scan.nextInt();

            while((PIN>9999)||(PIN<999)){ 
              System.out.println("Please re-enter a new PIN (Max 4 digits)");  //if the imput is longer than 4 digits it will ask the user to imput it again
              PIN = scan.nextInt();
            }

            Account.AddAccount(accname, 0, PIN);

            break;
          case 5:
            System.out.println("Please enter your PIN"); // 4 number pin
            PIN = scan.nextInt();

           // Account.remove(accname, 0, PIN);

          break;

          case 6:
            System.out.println("Please imput your account PIN"); 
            PIN = scan.nextInt();
            System.out.println("How much money would u like to transfer?"); 
            transaction = scan.nextDouble();
            System.out.println("Whats the other account's PIN"); 
            PIN2 = scan.nextInt();
            Account.Transaction(PIN,PIN2,transaction);



          break;
          case 7:
            System.out.println("Thanks for using our services");
            System.exit(0);

        }
      }
      

  }
}