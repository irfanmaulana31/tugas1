
package Latihan;

import javax.swing.JOptionPane;

public class KonversiNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program Konversi Nilai Angka menjadi Nilai Huruf
        
        String nilai1 = "";
        nilai1 = JOptionPane.showInputDialog("Enter Nilai pertama : ");
        String nilai2 = "";
        nilai2 = JOptionPane.showInputDialog("Enter Nilai kedua : ");
        String nilai3 = "";
        nilai3 = JOptionPane.showInputDialog("Enter Nilai Ketiga : ");
        int sum;
        int rata2;
        String pesan = null;
        int N1,N2,N3;

    N1 = Integer.parseInt(nilai1);
    N2 = Integer.parseInt(nilai2);
    N3 = Integer.parseInt(nilai3);

    sum = N1+N2+N3;
    rata2 = sum/3;
        
        if (rata2 >= 101){
            pesan = "nilai tidak boleh lebih dari 100";
        }else if (rata2 >= 90){
            pesan = "Nilai Anda A"+"\n"+":)" +"\n"+"Excellent!";
        }else if (rata2 >= 80 && rata2 <=89){
            pesan = "Nilai Anda B"+"\n"+":)" +"\n"+"Good Job!";
        }else if (rata2 >= 60 && rata2 <=79){
            pesan = "Nilai Anda C"+"\n"+":)" +"\n"+"Study Harder!";
        }else if (rata2 >= 50 && rata2 <=59){
            pesan = "Nilai Anda D"+"\n"+":-("+"\n"+"Sorry, you failed!";
        }else if (rata2 <=49){
            pesan = "Nilai Anda E"+"\n"+":-("+"\n"+"Sorry, you failed!";
        }else{
        }
        JOptionPane.showMessageDialog(null,pesan, " Hasil Konversi Nilai ",JOptionPane.INFORMATION_MESSAGE);
        }
}