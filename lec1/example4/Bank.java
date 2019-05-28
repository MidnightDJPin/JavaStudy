public class Bank {
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
