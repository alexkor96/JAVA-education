
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.*;
import java.util.ArrayList;

public class Task_4 {
	public static void main(String[] args) {
		try {
			BufferedReader readingFromFile = new BufferedReader(
					new FileReader("Task_2/Task_2.txt", Charset.forName("UTF-8")));

			ArrayList<String> lines = new ArrayList<>();
			ArrayList<Integer> age = new ArrayList<>();
			ArrayList<Integer> ascendingSorting = new ArrayList<>();
			
			String line;
			int index = 0;

			while ((line = readingFromFile.readLine()) != null) {
				lines.add(line);
				String[] parts = line.split(" ");
				age.add(Integer.parseInt(parts[3]));
				ascendingSorting.add(index);
				index++;
			}

			readingFromFile.close();

			// Сортировка в порядке возрастания
			for (int i = 0; i < age.size(); i++) {
				for (int j = i + 1; j < age.size(); j++) {
					if (age.get(i) > age.get(j)) {
						int tempAge = age.get(i);
						int tempIndex = ascendingSorting.get(i);
						age.set(i, age.get(j));
						ascendingSorting.set(i, ascendingSorting.get(j));
						age.set(j, tempAge);
						ascendingSorting.set(j, tempIndex);
					}
				}
			}

			System.out.println("\n\033[31mСортировка в порядке возрастания: \033[0m");
			for (int i : ascendingSorting) {
				String[] parts = lines.get(i).split(" ");
				System.out.println("\n\033[34m" + parts[0] + " " + parts[1].charAt(0) + ". " + parts[2].charAt(0) + ". "
						+ parts[3] + " " + parts[4] + "\033[0m");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

