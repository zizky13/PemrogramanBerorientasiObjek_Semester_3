package Pertemuan9;

import java.util.EmptyStackException;
import java.util.Stack;

public class Latihan_Pertemuan9_5 {
    public static void main(String[] args) {
        int count = 1000000;
        Stack s = new Stack();
        System.out.println("Tesitng for empty stack");
        long s1 = System.currentTimeMillis();
        for(int i = 0; i <= count; i++)
        if(!s.empty())
        s.pop();
        long s2 = System.currentTimeMillis();
        
        System.out.println((s2 - s1)+"Milliseconds");
        System.out.println("Catching EmptyStackException");
        s1 = System.currentTimeMillis();
        for(int i = 0; i <= count; i++){
            try {
                s.pop();
            } catch (EmptyStackException e) {
                // TODO: handle exception
            }
        }
        s2 = System.currentTimeMillis();
        System.out.println((s2 - s1) + "Milliseconds");
    }
}
