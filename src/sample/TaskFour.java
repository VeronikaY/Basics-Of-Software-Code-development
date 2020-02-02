// 4 Поменять местами дробную и целую части числа и вывести полученное значение числа.
package sample;
public class TaskFour {
public static void main(String[] args) {
    double R =456.123;
    int a = (int) R % 1000, b = (int) (R * 1000) % 1000;
    R = b + (double) a / 1000;
    System.out.println(R);
}
}