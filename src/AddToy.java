
import java.util.Scanner;

public class AddToy extends Toy {

    private static Scanner scanner = new Scanner(System.in);


    public AddToy(String name, int id, int pieces, int fall) {
        super(name, id, pieces, fall);
    }

    public AddToy() {

    }

    public void addToy()  {

        toys.add(new Toy(aadName(), addId(), addPieces(),addFall()));
        System.out.println(toys);

    }

    private String aadName() {
        System.out.println("Введите название игрушки.");
         return scanner.nextLine();
    }
    private int addId() {
        System.out.println("Введите id игрушки.");
        return scanner.nextInt();
    }
    private int addPieces() {
        System.out.println("Введите количество игрушек.");
        return scanner.nextInt();
    }
    private int addFall() {
        System.out.println("Введите процент выпадения.");
        return scanner.nextInt();
    }

}












