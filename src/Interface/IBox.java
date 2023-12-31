package Interface;

import Model.Toy;

public interface IBox<T> {
    public Toy get();

    public Toy delete();

    public int getSize();

    public int getWeight();

    boolean addToys(Toy toy);

    boolean next();
}
