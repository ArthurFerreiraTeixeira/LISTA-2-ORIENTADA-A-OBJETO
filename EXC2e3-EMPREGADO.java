public class Empregado {
    private double salario;
    private String matricula;
    
    public Empregado(double salario, String matricula) {
        this.salario = salario;
        this.matricula = matricula;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double valorinss() {
        double inss = 0;
        if (salario <= 1751.81) {
            inss = salario * 0.08;
        } else if (salario <= 2919.72) {
            inss = salario * 0.09;
        } else if (salario <= 5839.45) {
            inss = salario * 0.11;
        } else {
            inss = 642.34;
        }
        return inss;
    }
}
