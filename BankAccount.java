public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int ID, String pass) {
    accountID = ID;
    password = pass;
    balance = 0;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String newPass) {
    password = newPass;
  }

  public String getPass() {
    return password;
  }
  
}
