package Model;

import Interface.ICustomToy;
import java.util.*;

public class CustomToy<T extends Toy> implements ICustomToy {

    private static final Scanner scanner = new Scanner(System.in);
    private List<Toy> toyList = new ArrayList<>();
    private Queue<Integer> id = new LinkedList<>();
    private Queue<String> names = new LinkedList<>();
    private Queue<Integer> weight = new LinkedList<>();
    private int idToy;
    private String name;
    private int weightToy;

    // Генератор игрушек
    public List<Toy> getCustomToy() {

        String str = "";

        while (!str.equals("нет")) {
            addId(3);
            addName();
            addWeight(3);

            System.out.println("Продолжим? введите - нет, если нет \nили любой" +
                    "другой непустой символ для продолжения: ");
            str = scanner.next();
        }

        while (!id.isEmpty()) {
            idToy = id.poll();
            name = names.poll();
            weightToy = weight.poll();
            toyList.add(new Toy(idToy, name, weightToy));
        }
        return toyList;
    }

    // Проверка строки на число, что бы не падала программа
    private static boolean checkString(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Метод для ввода id
    private boolean addId(int n) {
        System.out.println("Введите id: ");
        String numeric = scanner.next();
        int digit = 0;

        if (n == 0) {
            System.out.println("Придется все делать самому!");
            return id.add(Randomizer.random(100));
        }

        if (checkString(numeric)) {
            digit = Integer.parseInt(numeric);
        } else {
            System.out.println("Здесь должно быть число!");
            addId(n - 1);// рекурсивно вызываем метод если в строке не числовое значение
        }
        return id.add(digit);
    }

    //  метод для ввода вероятности
    private boolean addWeight(int n) {
        System.out.println("Введите вероятность выпадения от 1 до 3: ");
        String mass = scanner.next();
        int digit = 0;

        if (n == 0) {
            System.out.println("Придется все делать самому!");
            return weight.add(Randomizer.random(100));
        }

        if (checkString(mass)) {
            digit = Integer.parseInt(mass);
            if (digit > 3) {
                System.out.println("Здесь должно быть число не более 3!");
                addWeight(n - 1);// рекурсивно вызываем метод если в строке не числовое значение
            }
        } else {
            System.out.println("Здесь должно быть число!");
            addWeight(n - 1);// рекурсивно вызываем метод если в строке не числовое значение
        }
        return weight.add(digit);
    }

    private boolean addName() {
        System.out.println("Введите название: ");
        String designation = scanner.next();
        return names.add(designation);
    }
}
