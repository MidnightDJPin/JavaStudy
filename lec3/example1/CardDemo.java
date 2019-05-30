public class CardDemo {
  public static void main(String[] args) {
    CreditCard zhang3 = new CreditCard();
    CreditCard li4 = new CreditCard();
    CreditCard wang5 = (CreditCard) zhang3.clone();
    System.out.println(zhang3 == li4);
    System.out.println(zhang3.equals(li4));
    System.out.println(li4.equals(wang5));
  }
}
