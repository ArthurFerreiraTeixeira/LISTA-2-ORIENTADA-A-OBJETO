public class Peixe extends Animal {
    private String habitat;
    
    public Peixe(String nome, double peso, String habitat) {
        super(nome, peso);
        this.habitat = habitat;
    }
    
    public String getHabitat() {
        return habitat;
    }
    
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
   
    public String toString() {
        return "Nome: " + getNome() + ", Peso: " + getPeso() + ", Habitat: " + habitat;
    }
}
