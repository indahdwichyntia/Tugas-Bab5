package methodstatic;
import java.util.Scanner;
public class mainKonveksi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Konveksi a = new Konveksi();
        int pilih, jenis, jumlah;
        do {
            System.out.println("Jaket yang dijual");
            System.out.println("1. Jaket A - Harga : Rp.100000");
            System.out.println("2. Jaket B - Harga : Rp.125000");
            System.out.println("3. Jaket C - Harga : Rp.175000");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu Konveksi (1/2/3/4):"); 
            pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jumlah jaket:"); 
                    jumlah = in.nextInt();
                    a.addBeliA(jumlah); 
                    System.out.println("Total Belanja"); 
                    System.out.println("Jenis Jaket A"); 
                    System.out.println("Jumlah = " + jumlah); 
                    System.out.println("Harga = " + a.getDiscPA());
                    System.out.println("Total = " + a.getDiscPA() * jumlah);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah jaket:"); 
                    jumlah = in.nextInt();
                    a.addBeliB(jumlah);
                    System.out.println("Total Belanja"); 
                    System.out.println("Jenis Jaket B"); 
                    System.out.println("Jumlah = " + jumlah);
                    System.out.println("Harga = " + a.getDiscPB());
                    System.out.println("Total = " + a.getDiscPB() * jumlah);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah jaket:"); 
                    jumlah = in.nextInt();
                    a.addBeliC(jumlah); 
                    System.out.println("Total Belanja"); 
                    System.out.println("Jenis Jaket C"); 
                    System.out.println("Jumlah = " + jumlah); 
                    System.out.println("Harga = " + a.getDiscPC());
                    System.out.println("Total = " + a.getDiscPC() * jumlah);
                    break;
                 case 4:
                     System.out.println("-----Anda Keluar Dari Program Konveksi-----");
                    break;
                default:
                    System.out.println("Pilihan yang Anda Masukkan Tidak Tersedia!!");  
            }
} while (pilih != 4);
    }
}