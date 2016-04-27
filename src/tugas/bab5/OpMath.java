package methodstatic;
public class OpMath {
    public static void Penjumlahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil Penjumalahan (a + b) : " + hasil);
    }
    public static void Pengurangan(int a, int b) {
        int hasil = a - b;
        System.out.println("Hasil Pengurangan (a - b) : " + hasil);
    }
    public void Perkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("Hasil Perkalian (a * b) : " + hasil);
    }
    public void Pembagian(double a, double b) {
        double hasil = a / b;
        System.out.println("Hasil Pembagian ( a / b) : " + hasil);
    }
    public void Sederhana(int pembilang, int penyebut) {
        int smntr, c, d;
        if (penyebut == 0) {
            return;
        }
        c = (pembilang < penyebut) ? penyebut : pembilang;
        d = (pembilang < penyebut) ? pembilang : penyebut;
        while (d != 0) {
            smntr = c % d;
            c = d;
            d = smntr;
        }
        pembilang /= c;
        penyebut /= c;
        System.out.println("Hasil Penyederhanaan :" + pembilang + "/" + penyebut);
    }
}