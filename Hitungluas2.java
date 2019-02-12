package Hitung_Luas;

public class HitungLuas2 {
    public static void main(String[] args) {
        double phi=3.14;
        double r=10;
        
        double L=phi*(r*r);
        double K=2*phi*r;
        
        System.out.println("Hitung Luas dan Keliling Lingkaran");
        System.out.println("Jika: ");
        System.out.println("Nilai jari-jari (r)="+r);
        System.out.println("Nilai phi yang digunakan= "+phi);
        System.out.println("Maka: ");
        System.out.println("Luas lingkaran= "+L);
        System.out.println("Keliling lingkaran= "+K);
    }
}