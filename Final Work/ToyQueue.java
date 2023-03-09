package org.example;
import java.util.PriorityQueue;

//ToyQueue.java: Затем мы создаем класс ToyQueue,
// который содержит коллекцию PriorityQueue, отсортированную по убыванию веса игрушек.
// В этом классе есть методы для добавления и получения игрушек из очереди.
public class ToyQueue {
    private PriorityQueue<Toy> queue;

    public ToyQueue() {
        queue = new PriorityQueue<>((t1, t2) -> Double.compare(t2.getWeight(), t1.getWeight()));
    }

    public void add(Toy toy) {
        queue.add(toy);
    }

    public Toy get() {
        return queue.poll();
    }
}
