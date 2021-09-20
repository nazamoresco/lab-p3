import java.util.Scanner;
import java.lang.Math;

public class InnerStatic {

  static double radio = new Scanner(System.in).nextDouble();
  static double PI = 3.1416;

  static double pow(double number, int power) {
    return Math.pow(number, power);
  }

  static class Circulo {

    static double getArea() {
      double a = PI * pow(radio, 2);
      System.out.println("El area es " + a);
      return a;
    }

    static double getLongitdudCircunsferencia() {
      double l = 2 * PI * radio;
      System.out.println("La longitud es: " + l);
      return l;
    }
  }
}
