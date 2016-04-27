package methodstatic;
import java.util.Scanner;
public class mainOpMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("-----Operasi Matematika-----");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Menyederhanakan");
            System.out.println("6. Keluar");
            System.out.print("Masukkan Pilihan Anda :");
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("============================");
                    System.out.print("Masukkan Angka ke-1 : ");
                    int ang1 = in.nextInt(); 
                    System.out.print("Masukkan Angka ke-2 : "); 
                    int ang2 = in.nextInt();
                    OpMath.Penjumlahan(ang1, ang2);
                    break;
                case 2:
                    System.out.println("============================");
                    System.out.print("Masukkan Angka ke-1 : ");
                    ang1 = in.nextInt(); 
                    System.out.print("Masukkan Angka ke-2 : "); 
                    ang2 = in.nextInt();
                    OpMath.Pengurangan(ang1, ang2); 
                    break;
                case 3:
                    System.out.println("============================"); 
                    System.out.print("Masukkan Angka ke-1 : ");
                    int angA = in.nextInt(); 
                    System.out.print("Masukkan Angka ke-2 : "); 
                    int angB = in.nextInt();
                    OpMath kali = new OpMath(); 
                    kali.Perkalian(angA, angB);
                    break;
                case 4:
                    System.out.println("============================"); 
                    System.out.print("Masukkan Angka ke-1 : ");
                    double angC = in.nextDouble(); 
                    System.out.print("Masukkan Angka ke-2 : "); double angD = in.nextDouble();
                    OpMath bagi = new OpMath(); 
                    bagi.Pembagian(angC, angD);
                    break;
                case 5:
                    
                    System.out.println("============================"); 
                    System.out.print("Masukkan Angka ke-1 : ");
                    int angE = in.nextInt(); 
                    System.out.print("Masukkan Angka ke-2 : ");
                    int angF = in.nextInt(); 
                    OpMath sederhana = new OpMath();
                    sederhana.Sederhana(angE, angF);
                    break;
                case 6 : 
                        System.out.println("-----Operasi Matematika Selesai-----");
                    break;
                default:                        
                    System.out.println("Pilihan yang Anda Masukkan Tidak Tersedia!!");
            }
            System.out.println("");
} while (pilih !=6);
            }
        }