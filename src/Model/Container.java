package Model;


import Interface.IBox;
import Interface.IContainer;
import Interface.ICustomToy;
import Interface.IToysFabric;
public class Container implements IContainer{

    private IBox toys = new Box();
    private IBox customToys = new Box();

    public IBox addFabricToys(IToysFabric fabricToys) {
        for (int i = 0; i < 10; i++) {
            toys.addToys(fabricToys.getToy());
        }
        return toys;
    }


    public IBox addCustomToys(ICustomToy customToy) {
        var toys = customToy.getCustomToy();
        while (!toys.isEmpty()) {
            for (int i = 0; i < toys.size(); i++) {
                if (toys.get(i).getWeight() == Randomizer.random(100)) {
                    customToys.addToys(toys.remove(i));
                }
            }
        }
        System.out.println();
        return customToys;
    }

    @Override
    public int size() {
        return toys.getSize();
    }

}
