/**银行账户的模型，由类<em>Bank</em>演示其用法。
 * @author    李文
 * @version   1.01
 * @see       Bank#main
 */
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

  /**向账户中存款
   * @param   amount    存款金额
   */
  public void deposit(double amount) {
    balance += amount;
  }

  /**从账户中取款
   * @param   amount    取款金额
   * @return    取款成功返回true，否则返回false
   */
  public boolean withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
      return true;
    } else {
      return false;
    }
  }

  /**查询账户当前余额
   * @return    账户的当前余额
   */
  public double getBalance() {
    return balance;
  }
}
