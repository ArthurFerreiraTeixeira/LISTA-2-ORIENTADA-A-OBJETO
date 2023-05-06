public class Administrador extends Empregado {
    private double ajudaDeCusto;
    
    public Administrador(String nome, int idade, String sexo, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, idade, sexo, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }
    
    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
