import java.util.*;
public class Account extends Main{
  // Private Variables of accounts
  private String name;
  private double balance;
  private int PIN;
  static ArrayList<Account> accarray = new ArrayList<Account>();

  public Account() {

	}

	public Account(String name, double balance, int PIN) {
		this.name = name;
    this.balance = balance;
    this.PIN = PIN;
	}
  

  public static void AddAccount(String accname, int balance, int PIN){
      accarray.add(new Account(accname, balance, PIN));
    }
    
  

  public static void DeleteAccount(int PIN){
    for(int i = 0; i < accarray.size(); i++) {
      if(((accarray.get(i)).GetPIN())==PIN){
        accarray.remove(i);
      }
    }
    
  }

  public static void printdata(){ // for Debug use only
    for(int i = 0; i < accarray.size(); i++) {   
      System.out.print((accarray.get(i)).GetName());
    }  
  }

  public static void printacc(int PIN){
        for(int i = 0; i < accarray.size(); i++) {   
      if(((accarray.get(i)).GetPIN())==PIN){
    System.out.println("========================");
    System.out.println("Account name: "+ (accarray.get(i)).GetName());
    System.out.println("Balance: "+ (accarray.get(i)).GetBalance());
    System.out.println("========================");
      }
    }  
  }

  public static void Deposit(int PIN, double ammount){ // Deposit moneey
    for(int i = 0; i < accarray.size(); i++) {
      if(((accarray.get(i)).GetPIN())==PIN){
        (accarray.get(i)).balance = accarray.get(i).GetBalance()+ammount;
      }else{
        System.out.println("User not found");
      }
    }
  }

  public static void Withdraw(int PIN, double ammount){ // Withdraw money
    for(int i = 0; i < accarray.size(); i++) {
      if(((accarray.get(i)).GetPIN())==PIN){
        (accarray.get(i)).balance = accarray.get(i).GetBalance()-ammount;
      }else{
        System.out.println("User not found");
      }
    }
  }
  public static void Transaction(int PIN,int PIN2, double ammount){ // Withdraw money
    for(int i = 0; i < accarray.size(); i++) {
      if(((accarray.get(i)).GetPIN())==PIN){
        (accarray.get(i)).balance = accarray.get(i).GetBalance()-ammount;
      }else{
        System.out.println("User not found");
      }
    }
    for(int i = 0; i < accarray.size(); i++) {
      if(((accarray.get(i)).GetPIN())==PIN2){
        (accarray.get(i)).balance = accarray.get(i).GetBalance()+ammount;
      }else{
        System.out.println("User not found");
      }
    }
  }


  String GetName (){ // Acces name instance variable 
    return name;
  }


  double GetBalance (){ // Acces Balance instance variable
    return balance;
  }


  int GetPIN (){ // Acces PIN instance variable
    return PIN;
  }


}