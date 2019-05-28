public class Account {

  //账户余额
  private double balance;

  //开户
  public Account() {
    balance = 0;
  }

  public Account(double amount) {
    balance = amount;
  }

  //存款
  public void deposit(double amount) {
    balance += amount;
  }

  //取款
  public boolean withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
      return true;
    } else {
      return false;
    }
  }

  //查询余额
  public double getBalance() {
    return balance;
  }
}
