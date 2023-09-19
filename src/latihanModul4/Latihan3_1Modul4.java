package latihanModul4;
import java.util.Scanner;

public class Latihan3_1Modul4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan bilangan: ");
        int input = sc.nextInt();
        int genap = 0;
        int ganjil = 0;

        while (input < 0){
            System.out.println("Input salah! Masukkan kembali");
            input = sc.nextInt();
        }

        for (int i = 1; i <= input; i++) {
            if (i % 2 == 0){
                   genap += i;
                    System.out.println("Nilai genap adalah: "+i);
                   continue;
            } else {
                ganjil += i;
                System.out.println("Nilai ganjil adalah: "+i);
            }
        }

        System.out.println("Hasil penjumlahan bilangan genap: " + genap);
        System.out.println("Hasil penjumlahan bilangan ganjil: " + ganjil);



    }
}
