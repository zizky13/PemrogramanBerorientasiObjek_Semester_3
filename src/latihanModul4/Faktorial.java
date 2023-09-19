package latihanModul4;

public class Faktorial {
    public static void main(String[] args) {
        long batas = 4;//inisiasi nilai batas agar tidak terjadi infinite loop
        long faktorial = 1;//inisiasi nilai penampung faktorial
        for (int i = 1; i <= batas ; i++) {//perulangan dilakukan
            faktorial = 1;//tiap iterasi, nilai faktorial akan dibuat = 1
            for (int faktor = 2; faktor <= i; faktor++) {//perulangan-nested dengan batas i
                faktorial *= faktor;//pada tiap iterasi, nilai faktorial akan diupdate
                System.out.println(i+"!"+" adalah = "+faktorial);//pada akhir iterasi, nilai faktorial akan diprint
            }
        }
    }
}
