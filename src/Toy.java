import java.util.ArrayList;
import java.util.Collection;

public class Toy {

    private String name;

    private int id;

    private int pieces;

    private int fall;

    protected Collection<Toy> toys = new ArrayList<>();

    public Toy(String name, int id, int pieces, int fall) {
        this.name = name;
        this.id = id;
        this.pieces = pieces;
        this.fall = fall;
    }



    public Toy() {

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPieces() {
        return pieces;
    }

    public int getFall() {
        return fall;
    }

    public Collection<Toy> getToys() {
        return toys;
    }

    @Override
    public String toString() {
        return String.format("Игрушка: %s, id: %d, количество: %d, процент выпадения: %d"
                + "\n",name, id, pieces, fall);
    }
}












