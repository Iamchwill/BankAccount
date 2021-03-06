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
  /*public String getPass() {
    return password;
  }
  */

  public boolean deposit(double amount) {
      if (amount >= 0) {
        balance += amount;
        return true;
      }
      return false;
    }

    public boolean withdraw(double amount) {
      if (amount >= 0 && amount <= balance) {
        balance -= amount;
        return true;
      }
      return false;
    }

  public String toString() {
    return "#" + accountID + "\t $"+ balance;
  }

  private boolean authenticate(String pass) {
    return password.equals(pass);
  }

  public boolean transferTo(BankAccount other, double amount, String pass) {
    if (authenticate(pass) && withdraw(amount)) {
       other.deposit(amount);
       return true;
    }
    return false;
  }
}
