
package Hitung_Luas;

import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int panjang;
        int lebar;
        int luas;

        System.out.print("Masukkan Panjang   : ");
        panjang = input.nextInt();//input panjang

        System.out.print("Masukkan Lebar : ");
        lebar = input.nextInt();//input lebar
        
        //Menghitung Luas
        luas = panjang*lebar;

        //Tampilkan hasil
        System.out.println("Luasnya adalah " + luas);
    }
    
}
