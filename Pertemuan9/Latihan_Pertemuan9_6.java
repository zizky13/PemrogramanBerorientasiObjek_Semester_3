package Pertemuan9;

public class Latihan_Pertemuan9_6 {
        public static void main(String[] args) {
            int array[] = {20, 20, 40};
            int num1 = 15;
            int num2 = 10;
            int result = 10;
            try {
                result = num1 / num2;
                System.out.println("The result is: " + result);
                for (int i = 5; i >= 0; i--) {
                    System.out.println("Value of array is: " + array[i]);
                }
            } catch (Exception e) {
                System.out.println("Exception Occured: " + e);
            }
        }
    }
    