package Model;

public class Toy implements Comparable<Toy>{

    private int id;
    private String name;
    private int weight;

    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }


    public int getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "toy: ( " +
                "Вероятность = " + weight +
                ", название = '" + name + '\'' +
                ", id = " + id + " )" + "\n";
    }

    //  Компаратор сортирует объект по weight
    @Override
    public int compareTo(Toy toy) {
        return toy.weight - weight;
    }

}
