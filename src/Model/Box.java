package Model;

import Interface.IBox;

import java.util.PriorityQueue;
import java.util.Queue;
public class Box implements IBox{

    private Toy toy;
    private int id;
    private int weight;
    private Queue<Toy> toys = new PriorityQueue<>();

    // Добавление объекта в коробку
    public boolean addToys(Toy toy) {
        return toys.add(toy);
    }

    //  Проверяем есть ли элеметы в очерерди. Возвращаем boolean
    public boolean next() {
        return toys.isEmpty();
    }

    // Возвращает и удаляет объект, либо null

    public Toy get() {
        return toys.poll();
    }

    public Toy delete() {
        return toys.remove();
    }

    // Возвращаем размер коробки
    public int getSize() {
        return toys.size();
    }

    // Возвращаем вес объекта
    public int getWeight() {
        return toy.getWeight();
    }


    @Override
    public String toString() {
        return "Box{" +
                "toy=" + toy +
                ", id=" + id +
                ", weight=" + weight +
                ", toys=" + toys +
                '}';
    }

}
