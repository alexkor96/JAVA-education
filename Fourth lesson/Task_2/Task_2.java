//2. Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.*;


public class Task_2 {
    public static void main(String[] args) {
        try {
            BufferedReader readingFromFile = new BufferedReader(new FileReader("Task_2/Task_2.txt", Charset.forName("UTF-8")));
            String line;
            while ((line = readingFromFile.readLine()) != null) {
                String[] parts = line.split(" ");
                System.out.println("\n\033[34m" + parts[0] + " " + parts[1].charAt(0) + ". " + parts[2].charAt(0) + ". " + parts[3] + " " + parts[4] + "\033[0m");
            }
            readingFromFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}