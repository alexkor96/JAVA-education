package org.example;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//Main.java: В методе main мы создаем три игрушки и добавляем их в очередь.
// Затем мы вызываем метод get() десять раз и записываем имена игрушек в файл toys.txt.
public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy(1, "Doll", 5, 10.0);
        Toy toy2 = new Toy(2, "Car", 3, 5.0);
        Toy toy3 = new Toy(3, "Ball", 2, 3.0);

        ToyQueue toyQueue = new ToyQueue();
        toyQueue.add(toy1);
        toyQueue.add(toy2);
        toyQueue.add(toy3);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("toys.txt"))) {
            for (int i = 0; i < 10; i++) {
                Toy toy = toyQueue.get();
                writer.write(toy.getName() + "\n");
                toy.setWeight(toy.getWeight() / 2);
                if (toy.getQuantity() > 0) {
                    toy.setQuantity(toy.getQuantity() - 1);
                    if (toy.getQuantity() > 0) {
                        toyQueue.add(toy);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}