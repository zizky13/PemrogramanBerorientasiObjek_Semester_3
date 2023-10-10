package LatihanPertemuan7;

public class demoOverLoading {
    public static void main(String[] args) {
        System.out.println("");
        phone p1 = new phone();
        phone p2 = new phone("Nokia");
        phone p3 = new phone("Sony Ericson", 500);

        System.out.println("Perbedaan output dari masing2 konstruktor");
        p1.lihatPhone();
        p2.lihatPhone();
        p3.lihatPhone();

        phone p4, p5;
        p4 = new phone();
        p5 = new phone();
        p4.isiPhone("Samsung");
        p5.isiPhone("Samsung",5000);
        System.out.println("Perbedaan output masing2 method");
        p4.lihatPhone();
        p5.lihatPhone();
    }
}
