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

  public static void main(String[] args) {
    Account zhang3 = new Account();

    zhang3.deposit(500);
    if (!zhang3.withdraw(100)) {
      System.out.println("取款余额不足！");
    }

    Account li4 = new Account();
    if (!zhang3.withdraw(150)) {
      System.out.println("转账余额不足！");
    } else {
      li4.deposit(150);
    }

    System.out.println("张三账户余额为：" + zhang3.getBalance());
    System.out.println("李四账户余额为：" + li4.getBalance());
  }
}
