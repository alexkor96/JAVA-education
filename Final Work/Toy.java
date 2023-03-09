package org.example;


//Toy.java: В данном примере мы создаем класс Toy,
// который имеет поля id, name, quantity(количество) и weight(вес),
// а также конструктор и методы для получения и установки значений этих полей.

public class Toy {
    private int id;
    private String name;
    private int quantity;
    private double weight;
    public Toy(int id, String name, int quantity, double weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getId() {
            return id;
    }

    public String getName() {
            return name;
    }

    public int getQuantity() {
            return quantity;
    }

    public double getWeight() {
            return weight;
    }

    public void setWeight(double weight) {
            this.weight = weight;
    }

    public String toString() {
            return "Toy [id=" + id + ", name=" + name + ", quantity=" + quantity + ", weight=" + weight + "]";
    }

    public void setQuantity(int quantity) {
            this.quantity = quantity;
    }
}