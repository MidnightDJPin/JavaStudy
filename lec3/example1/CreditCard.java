public class CreditCard extends Card implements Cloneable {

  private static double maxOverdraft = 1000;
  private double balance;

  public CreditCard() {
    System.out.println("CreditCard Constructor");
    balance = 0;
  }
  public static void adjustOverdraft(double max) {
    maxOverdraft = max;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public boolean withdraw(double amount) {
    if (amount <= balance + maxOverdraft) {
      balance -= amount;
      return true;
    } else {
      return false;
    }
  }
  public double getBalance() {
    return balance;
  }

  public Object clone() {
    try {
      return super.clone();
    } catch (Exception e) {
      e.printStackTrace();
      throw new InternalError();
    }
  }
    public boolean equals(CreditCard aCreditCard) {
      return this.balance == aCreditCard.balance
        && this.maxOverdraft == aCreditCard.maxOverdraft;
    }
}
