public class FuncionarioEstagiario extends Funcionario {

    public FuncionarioEstagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase - (salarioBase * 0.05);
    }
}
