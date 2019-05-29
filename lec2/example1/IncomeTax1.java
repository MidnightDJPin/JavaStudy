import java.util.Scanner;
public class IncomeTax1 {
  public static void main(String[] args) {
    final double BASE = 800;
    double income = 0;

    try {
      Scanner scanner = new Scanner(System.in);
      income = scanner.nextDouble();
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("input error");
    }

    double taxible = income - BASE;
    double tax = 0.00;
    if(taxible > 20000) {
      tax = tax + (taxible - 20000) * 0.25;
      taxible = 20000;
    }
    if(taxible > 5000) {
      tax = tax + (taxible - 5000) * 0.2;
      taxible = 5000;
    }
    if(taxible > 2000) {
      tax = tax + (taxible - 2000) * 0.15;
      taxible = 2000;
    }
    if(taxible > 500) {
      tax = tax + (taxible - 500) * 0.1;
      taxible = 500;
    }
    if (taxible > 0) {
      tax = tax + taxible * 0.05;
    }
    System.out.println("total tax:" + tax);
  }
}
