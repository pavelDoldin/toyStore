package Controller;

import Interface.*;
import Model.*;
import View.View;

import java.util.Scanner;
public class Controller {

    //    Создал фабрику игрушек
    private final IToysFabric fabricToys = new ToysFabric();
    //    Упаковка в бокс
    private final IContainer container = new Container();
    private final ICustomToy customToy = new CustomToy();
    //    Создали бокс на основе приоритетной очереди
    private IBox box = new Box();
    private IBox box1 = new Box();

    private final IView view = new View();

    public void getView(int n) {
        System.out.println("Выберите способ\n" +
                "1 - вручную ввести данные,\n" +
                "2 - 'фабричный' способ.\n" +
                "3 - exit.");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.next();
        int result = 0;
        if(checkString(temp) || result > 3) {
            result = Integer.parseInt(temp);
            switch (result) {
                case 2:
                    view.fileWrite(box1 = container.addFabricToys(fabricToys));
                    break;
                case 1:
                    view.fileWrite(box = container.addCustomToys(customToy));
                    break;
            }
        }

        if(n == 0 || result == 3){
            System.out.println("Хватит!");
            return;
        }
        getView(n - 1);


    }
    private static boolean checkString(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
