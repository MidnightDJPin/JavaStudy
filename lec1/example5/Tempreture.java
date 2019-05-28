import java.io.*;
public class Tempreture {
  public static void main(String[] args) {
    float fah;  //华氏温度
    float cel;  //根据fah转换得到的摄氏温度
    //输入今天天气预报的华氏温度fah
    System.out.print("今天预报的华氏气温为：");
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String inputLine = in.readLine();
      fah = Float.valueOf(inputLine).floatValue();
    } catch (Exception e) {
      System.out.println("用户没有输入一个合法的华氏气温。");
      return;
    }
    //根据华氏温度fah计算摄氏温度cel
    cel = (fah - 32) * 5 / 9;
    //输出转换得到的摄氏温度cel
    System.out.println("今天气温为摄氏" + cel + "度。");
  }
}
