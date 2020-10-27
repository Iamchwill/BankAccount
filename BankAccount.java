public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int ID, String pass) {
    accountID = ID;
    password = pass;
    balance = 0;
  }
}
