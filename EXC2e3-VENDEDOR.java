public class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, String endereco, String telefone, String cpf, String email,
                     int matricula, double salarioBase, double imposto, int codigoSetor,
                     double valorVendas, double comissao) {
        super(nome, endereco, telefone, cpf, email, matricula, salarioBase, imposto, codigoSetor);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas * comissao / 100);
    }
}
