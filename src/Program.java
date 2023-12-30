public class Program {

    public static void main(String[] args) {

        Toy toy = new Toy();
        AddToy addToy = new AddToy();
        RemoveToy removeToy = new RemoveToy();
        RunToyStore runToyStore = new RunToyStore(toy, addToy, removeToy);
        runToyStore.runToyStore();


    }

}
