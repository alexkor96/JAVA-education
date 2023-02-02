//1. Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader

import java.io.*;
import java.nio.charset.*;

public class Program4 {

    public static void main(String[] args) {
        try {
			FileWriter writingToFile = new FileWriter("Fourth lesson/Task_1/Task_1.txt", Charset.forName("UTF-8")); // запись в файл
			writingToFile.append("Работа с файлом: загрузка строки в файл!");
			writingToFile.flush();

			String line = "";
			FileReader readingFromFile = new FileReader("Fourth lesson/Task_1/Task_1.txt", Charset.forName("UTF-8")); // чтение из файла
			while (readingFromFile.ready()) {
				line += (char)readingFromFile.read();
			}

			

			System.out.println("\n\033[34m" + line + "\033[0m");

		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}