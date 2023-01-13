import java.util.Random;

public class Program {
    public static void main(String[] args) {
        // print("Hello, world!");
        int x = 0;
        double l = 1;
        byte b =  2;
        float f= 0.1f;
        char c = 'f'; // 16 бит беззнаковый
        String str = "Привет!";
        str += " Hello";
        // int[] aI = new int[10]; //массив, индексы с 0.
        // Random rnd = new Random();
        // for (int j = 0; j < aI.length; j++) {
        //     aI[j] = rnd.nextInt(0,10);
        //     print(String.valueOf(aI[j]));
        // }
        print(str);
        print(str.toLowerCase());
        
    }
        
    private static void print(String str) {
        System.out.println(str);       
    }
    
}