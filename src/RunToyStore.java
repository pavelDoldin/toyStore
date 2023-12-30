import java.util.Scanner;

public class RunToyStore {

    private Toy toy;
    private AddToy addToy;
    private RemoveToy removeToy;
    private static Scanner scanner = new Scanner(System.in);

    public RunToyStore(Toy toy, AddToy addToy, RemoveToy removeToy) {
        this.toy = toy;
        this.addToy = addToy;
        this.removeToy = removeToy;
    }

    public void runToyStore() {

        while (true) {

            System.out.println("1 Дабавить игрушку.\n" +
                    "2 удалить игрушку.");

            switch (scanner.nextLine()) {
                case "1" : addToy.addToy();
                break;
                case "2" : removeToy.removeToy();
                default:
                    System.out.println("Нет такого значения");
            }
        }

    }
}













