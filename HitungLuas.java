package Hitung_Luas;

import java.util.Scanner;

public class HitungLuas1 {
   public static void main(String[] args) {
      int jarijari;
      double luas;
  
   Scanner scan = new Scanner(System.in);
   System.out.println("Menghitung Luas Lingkaran");
   System.out.print("Masukan Jari-Jari: ");
      jarijari = scan.nextInt();
   
      luas = 3.14 * (jarijari * jarijari);
   System.out.println("Luas Lingkaran= " +luas);
    }
}
