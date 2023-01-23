
    
    import java.lang.StringBuilder;
    import java.util.Scanner;
    
    public class Program2 {
        // Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        public static void word (String str1, String str2) {
            System.out.println(str1.contains(str2));
            }
        // Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
            public static void word2 (StringBuilder Str1, StringBuilder Str2) {
                System.out.println(Str1 == Str2.reverse());
            }


        // Дано два числа, например 3 и 56, необходимо составить следующие строки:
        //    3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        
        //Метод объединения строк
        public static void appendOperations(StringBuilder operation, int num1, int num2) {
            operation.append(num1 + " + " + num2 + " = " + (num1 + num2) + "\n");
            operation.append(num1 + " - " + num2 + " = " + (num1 - num2) + "\n");
            operation.append(num1 + " * " + num2 + " = " + (num1 * num2) + "\n");
        }
    
        //// Получение строк с консоли, проверка на правильность ввода
        public static int getUserInput(Scanner transformations, String message) {
            int num = 0;
            boolean isCorrect = false;
            while (!isCorrect) {
                System.out.print(message);
                if (transformations.hasNextInt()) {
                    num = transformations.nextInt();
                    isCorrect = true;
                } else {
                    System.out.println("\n\033[31mНеверный ввод. Пожалуйста, повторите ввод!\033[0m\n");
                    transformations.next();
                }
            }
            return num;
        }
    
        //Метод ввода пользователем данных и вывод результата на экран
        public static void main(String[] args) {
            Scanner transformations = new Scanner(System.in);
            StringBuilder operation = new StringBuilder();
    
            int num1 = getUserInput(transformations, "\nВведите первое число: ");
            int num2 = getUserInput(transformations, "Введите второй число: ");
    
            appendOperations(operation, num1, num2);
            System.out.println(operation.toString());

        // Замените символ "="" на слово "равно". Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().   
            String initialString = "'='";
            StringBuilder modifiedString = new StringBuilder(initialString);
    
            int index = initialString.indexOf("=");
            modifiedString.deleteCharAt(index);
            modifiedString.insert(index, "равно");
    
            String newString = modifiedString.toString();
            System.out.println("\nНачальная строка: \033[31m" + initialString + "\033[0m");
            System.out.println("Новая строка: \033[31m" + newString + "\033[0m");
            
        
        }
    
    }