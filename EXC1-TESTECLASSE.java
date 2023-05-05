public class TesteClasse {
    public static void main(String[] args) {
        Animal animal = new Animal("Rex", 20.5);
        System.out.println(animal.toString());
        
        Peixe peixe = new Peixe("Nemo", 0.2, "Mar");
        System.out.println(peixe.toString());
        
        Cachorro cachorro = new Cachorro("Boris", 10.0, "Beagle");
        System.out.println(cachorro.toString());
    }
}
