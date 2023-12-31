package Interface;

public interface IContainer {

    IBox addCustomToys(ICustomToy customToy);

    IBox addFabricToys(IToysFabric fabricToys);

    int size();
}
