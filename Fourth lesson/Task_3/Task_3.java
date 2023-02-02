// Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках.


import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.*;

public class Task_3 {
	public static void main(String[] args) {
		ArrayList<String> surnames = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> patronymic = new ArrayList<>();
		ArrayList<Integer> age = new ArrayList<>();
		ArrayList<String> genders = new ArrayList<>();
		try {
			BufferedReader readingFromFile = new BufferedReader(
					new FileReader("Task_2/Task_2.txt", Charset.forName("UTF-8")));
			String line;
			while ((line = readingFromFile.readLine()) != null) {
				String[] parts = line.split(" ");
				surnames.add(parts[0]);
				names.add(parts[1]);
				patronymic.add(parts[2]);
				age.add(Integer.valueOf(parts[3]));
				genders.add(parts[4]);
			}
			readingFromFile.close();

			for (int i = 0; i < surnames.size(); i++) {
				System.out.println("\n\033[34m" + surnames.get(i) + " " + names.get(i).charAt(0) + ". " + patronymic.get(i).charAt(0) + ". "
						+ age.get(i) + " " + genders.get(i) + "\033[0m");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
