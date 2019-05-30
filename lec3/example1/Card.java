public class Card implements Cloneable {
  private double balance;

  public Card() {
    System.out.println("Card Constructor");
    balance = 0;
  }

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

  public Object clone() {
    try {
      return super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
      throw new InternalError();
    }
  }
}
