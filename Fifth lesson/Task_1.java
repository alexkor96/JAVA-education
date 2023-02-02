// 1. Создать словарь HashMap. Обобщение <Integer, String>.
// 2. Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
// 3. Изменить значения сделав пол большой буквой.
// 4. Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
// 5. *Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_1 {
	public static void main(String[] args) {
		HashMap<Integer, String> dictionaryPeople = new HashMap<Integer, String>();

		dictionaryPeople.put(1, "Иванов Иван Иванович 25 м");
		dictionaryPeople.put(2, "Петров Петр Петрович 18 м");
		dictionaryPeople.put(3, "Сидорова Елена Николаевна 24 ж");
		dictionaryPeople.put(4, "Сергеев Сергей Сергеевич 19 м");
		dictionaryPeople.put(5, "Козлова Анна Дмитриевна 20 ж");

		if (!dictionaryPeople.containsKey(6)) {
			dictionaryPeople.put(6, "Викторова Ирина Андреевна 30 ж");
		}

		// Создание нового списка, содержащий все записи dictionaryPeople, и сортировка
		// его по возрасту человека.
		List<Map.Entry<Integer, String>> list = new ArrayList<>(dictionaryPeople.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {

			// Сортировка по возрасту в порядке возрастания
			public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer, String> entry2) {
				return Integer.compare(Integer.parseInt(entry1.getValue().split(" ")[3]),
						Integer.parseInt(entry2.getValue().split(" ")[3]));
			}
		});

		System.out.println("\n\033[33mСортировка в порядке возрастания: \n\033[0m");
		int counter = 1;
		for (Map.Entry<Integer, String> entry : list) {
			String[] parts = entry.getValue().split(" ");
			String surname = parts[0];
			String initials = parts[1].charAt(0) + "." + parts[2].charAt(0) + ".";
			String age = parts[3];
			String gender = parts[4];
			System.out.println(counter + ". " + surname + " " + initials + " " + age + " " + gender.toUpperCase());
			counter++;
		}
	}

}