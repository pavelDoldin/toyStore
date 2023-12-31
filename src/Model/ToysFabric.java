package Model;


import Interface.IToysFabric;

import java.util.Random;
public class ToysFabric <T extends Toy> implements IToysFabric {

    private static final Random random = new Random();
    private static final String[] names = {"Шарик", "Мяч резиновый", "Кубик", "Пистолет",
            "Лук", "Меч", "Машина", "Вертолет", "Квадрокоптер"};

    private int id;
    private int weight;

    @Override
    public Toy getToy() {
        int temp = random.nextInt(100);
//      Вуроятность выпадения игрушки привязана к weight.
        if (temp < 20) {
            weight = 1;
        } else if (temp < 40) {
            weight = 2;
        } else {
            weight = 3;
        }


        if (weight == 1) {
            id = random.nextInt(0, 3);
        } else if (weight == 2) {
            id = random.nextInt(3, 6);
        } else {
            id = random.nextInt(6, 9);
        }
        return new Toy(id + 1, names[id], weight);
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public String getName() {
        return names[id];
    }

}
