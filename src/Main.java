import Controller.Controller;
import Interface.IContainer;
import Interface.ICustomToy;
import Model.Container;
import Model.CustomToy;
import Model.Toy;
public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.getView(3);

    }

}
