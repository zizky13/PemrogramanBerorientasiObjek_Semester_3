package Pertemuan9;


class WrongInputException extends Exception {
    WrongInputException(String s){
        super(s);
    }
}

class Input{
    void method()throws WrongInputException{
        throw new WrongInputException("Wrong Input");
    }
}

public class Latihan_Pertemuan9_14 {
    public static void main(String[] args) {
        
        try {
            new Input().method();
        } catch (WrongInputException wie) {
            System.out.println(wie.getMessage());
        }
    }    
}
