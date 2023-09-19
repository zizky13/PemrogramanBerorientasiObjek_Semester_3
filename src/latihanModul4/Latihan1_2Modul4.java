package latihanModul4;

public class Latihan1_2Modul4 {
    public static void main(String[] args) {
        //inisiasi variabel disini
        int faktorA = 5;
        int faktorB = 4;
        int faktorialA = 1;
        int faktorialB = 1;
        //mulai iterasi untuk faktorial
        //iterasi dimulai dari nilai faktor itu sendiri, dan akan terus decrement hingga nilai i = 1
        for (int i = faktorA; i > 0 ; i--) {
            //pada tiap iterasi, nilai i = faktor a, dan akan terus berkurang
            //akan muncul pola faktor a, faktor a - 1, faktor a - 2, dst
            faktorialA *= i;
            if (i <= faktorB){//agar pada satu kali loop dapat menghitung 2 nilai faktorial, digunakan if
                //if dibuat untuk cek apakah nilai i skrg kurang dari nilai faktor B
                //jika iya, maka kita bisa lakukan iterasi
                faktorialB *= i;
            }
        }
        //bagi kedua hasil faktorial, lalu print hasilnya
        int hasilBagi = faktorialA/faktorialB;
        System.out.println(hasilBagi);
    }
}
