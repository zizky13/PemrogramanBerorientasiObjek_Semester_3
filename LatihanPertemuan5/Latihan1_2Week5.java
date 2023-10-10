package LatihanPertemuan5;

public class Latihan1_2Week5 {
    public static boolean prime(int i) {
        if (i <= 1) {
            return false;
        }
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("Output Pertama");
        for (int i = 5; i <= 50 ; i+=5) {
            System.out.println(i);
        }

        System.out.println("Output kedua");
        for (int i = 1; i <= 15 ; i+=2) {
            System.out.println(i);
        }

        System.out.println("Output ketiga");
        for (int i = 1; i <= 17 ; i++) {
            if(prime(i)){
                System.out.println(i);
            }
        }
    }
}
