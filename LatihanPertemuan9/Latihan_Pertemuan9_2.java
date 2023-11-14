package LatihanPertemuan9;
class Animal extends Exception{

}

class Mammel extends Animal{

}

public class Latihan_Pertemuan9_2 {
    public static void main(String[] args) {
        try{
            throw new Mammel();
        }
        catch (Mammel m){
            System.err.println("It is Mammel");
        }
        catch(Animal a){
            System.err.println("it is Animal");
        }
    }
}
