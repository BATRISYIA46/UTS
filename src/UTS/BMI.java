package UTS;

import java.util.Scanner;
public class BMI {
    
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        int berat;
        double tinggi;
        double bmi;
        
        System.out.println("Berat Badan = ");
        berat = input.nextInt();
        System.out.println("Tinggi Badan = ");
        tinggi = input.nextDouble();
        
        bmi = berat/(tinggi/100 * tinggi/100);
        System.out.println("Hasil BMI Anda = " + bmi);
        
        if (bmi > 27 ){
            System.out.println("Anda termasuk Obesitas, sebaiknya segera membuat program menurunkan berat badan karena obesitas / terlalu gemuk tidak baik bagi kesehatan");
        }
        else if (bmi > 25 ){
            System.out.println("Kelebihan Berat Badan, anda sudah termasuk dalam kategori gemuk. sebaiknya hindari makanan berlemak dan mulailah meningkatkan olahraga seminggu minimal 2 kali.");
        }
        else if (bmi > 18.5 ){
            System.out.println("Berat badan anda Normal, selamat berat badan anda termasuk ideal.");
        }
        else {
            System.out.println("Anda Kekurangan Berat Badan, sebaiknya mulai menambah berat badan dan mengkonsumsi makanan berkarbohidrat di imbangi dengan olahraga.");
        }
    }
    
}
