public class Tester {
  public static void main(String[] args) {
    BankAccount a1 = new BankAccount(12345, "54321");
    BankAccount a2 = new BankAccount(19876, "67891");
    System.out.println(a1.getBalance());
    System.out.println(a2.getAccountID());
    //System.out.println(a1.getPass());
    a1.setPassword("00000");
    //System.out.println(a1.getPass());
    System.out.println(a1.getBalance());
    System.out.println(a2.getAccountID());
    System.out.println(a1.deposit(1000));
    System.out.println(a1.getBalance());
    System.out.println(a1.withdraw(500));
    System.out.println(a1.getBalance());
    System.out.println(a2.withdraw(50));
    System.out.println(a2.deposit(100));
    System.out.println(a2.getBalance());
  }
}
