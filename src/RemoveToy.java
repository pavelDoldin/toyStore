import java.util.Scanner;

public class RemoveToy extends Toy {


    private Scanner scanner = new Scanner(System.in);
    public RemoveToy(String name, int id, int pieces, int fall) {
        super(name, id, pieces, fall);
    }

    public RemoveToy() {
    }

    public void removeToy(){

        System.out.println(toys);
        System.out.println("Для удаления игрушки введите id.");

    }

}
