import java.util.*;
public class LuasSegitiga {
  public static void main(String[] args) {
    double a, t, luas;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan panjang alas: ");
    a = scan.nextDouble();
    System.out.print("Masukkan tinggi segitiga: ");
    t = scan.nextDouble();
    luas = 0.5 * a * t;
    
    System.out.println("Luas segitiga adalah "+luas);
    
  }
}