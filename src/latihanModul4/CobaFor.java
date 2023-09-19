package latihanModul4;

public class CobaFor {
    public static void main(String[] args) {
        int jml = 0;//inisiasi variabel penampung
        for (int i = 1; i <= 10 ; i++) {//melakukan iterasi sebanyak 10 kali menggunakan for-loop
            jml+=i;//tiap iterasi, nilai jumlah akan ditambah sebanyak i
        }
        System.out.print("Jumlah semua bilangan: " +jml);//tampilkan hasil jumlah
    }
}
