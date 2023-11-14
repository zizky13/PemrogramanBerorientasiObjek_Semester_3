package LatihanPertemuan11;

public class MainClass {
        public static void main(String[] args) {
            MyClass t = new MyClass(0);
            t.info();
            t.info("overload method");
            //overload constructor
            new MyClass();
        }
}
