package LatihanPertemuan11;

class MyClass {
        int height;
        MyClass(){
            System.out.println("bricks");
            height = 0;
        }
        MyClass(int i){
            System.out.println("Building a new House that is " + i + " feet tall");
            height = 1;
        }

        void info(){
            System.out.println("House is" + height + " feet tall");
        }

        void info(String s){
            System.out.println(s + ": House is " + height + " feet tall");
        }
}

