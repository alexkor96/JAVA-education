// Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел.
// Удалить из первого списка элементы отсутствующие во втором списке. 
// Отсортировать первый список методом sort класса Collections

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Program3 {
    public static void main(String[] args) {
       	// Основной метод программы
	
		ArrayList<Integer> list1 = creatingList();
		ArrayList<Integer> list2 = creatingList();

		System.out.println("\nПервый список: " + list1);
		System.out.println("Второй список" + list2 + "\n");

		sortList(list1);
		System.out.println("\033[34mОтсартированный список в порядке возрастания: " + list1 + "\033[0m");

		removingMissingElements(list1, list2);
		System.out.println("\033[31mОкончательный список: " + list1 + "\033[0m");
	}

	// Метод создания нового рандомного списка ArrayList
	private static ArrayList<Integer> creatingList() {
		ArrayList<Integer> list = new ArrayList<>();
		Random randomNumber = new Random();
		for (int i = 0; i < 20; i++) {
			list.add(randomNumber.nextInt(100));
		}
		return list;
	}

	// Метод удаления всех элементов списка list1 отсутствующие в list2
	private static void removingMissingElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		list1.removeIf(i -> !list2.contains(i));
	}

	// Метод сортировки элементов списка в порядке возрастания
	private static void sortList(ArrayList<Integer> list1) {
		Collections.sort(list1);
	}   
}
