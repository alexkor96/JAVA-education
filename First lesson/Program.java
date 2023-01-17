import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        //Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
         Random rnd = new Random();
         int i = rnd.nextInt(0, 2000);
         System.out.println(i);
     //Посчитать и сохранить в n номер старшего значащего бита выпавшего числа   
         int n = Integer.toBinaryString(i).length();
         System.out.println(n);
     // Найти все кратные n числа в диапазоне от i до Short.MIN_VALUE сохранить в массив m2
         int c = 0;
         for (int j = Short.MIN_VALUE; j < i; j++) {
             if (j%n == 0) c++;
         }

         int [] m1 = new int [c];
         c = 0;
         for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j%n == 0) m1[c++] = j;
         }
        c = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j%n == 0) c++;
        }
     // Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int [] m2 = new int [c];
        c = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j%n == 0) m2[c++] = j;
         } 

         System.out.println(Arrays.toString(m1));
         System.out.println(Arrays.toString(m2));
        
    } 
}