package sample;

public class TaskThree {
public static void main(String[] args) {
    int x = 1, y = 2;
    System.out.println(String.format("%.5g%n",((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) *
        Math.tan(x * y)));
  }
}