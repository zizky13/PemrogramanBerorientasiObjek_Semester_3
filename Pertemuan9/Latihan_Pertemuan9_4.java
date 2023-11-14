package Pertemuan9;


public class Latihan_Pertemuan9_4 {
    static void f(){
        throw new RuntimeException("From f()");
    }
    static void g(){
        f();
    }
    public static void main(String[] args) {
        g();
    }
}
