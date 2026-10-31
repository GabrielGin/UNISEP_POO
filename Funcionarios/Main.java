public class Main {

    public static void main(String[] args) {

        // Criando os funcionários
        FuncionarioCLT clt = new FuncionarioCLT("João", 3000);
        FuncionarioPJ pj = new FuncionarioPJ("Pedro", 4000);
        FuncionarioEstagiario estagiario = new FuncionarioEstagiario("Lucas", 1500);

        // Exibindo os resultados
        System.out.println("===== FUNCIONARIOS =====");

        System.out.println("\nFuncionario CLT:");
        System.out.println("Nome: " + clt.nome);
        System.out.println("Salario Base: R$ " + clt.salarioBase);
        System.out.println("Salario Final: R$ " + clt.calcularSalario());

        System.out.println("\nFuncionario PJ:");
        System.out.println("Nome: " + pj.nome);
        System.out.println("Salario Base: R$ " + pj.salarioBase);
        System.out.println("Salario Final: R$ " + pj.calcularSalario());

        System.out.println("\nFuncionario Estagiario:");
        System.out.println("Nome: " + estagiario.nome);
        System.out.println("Salario Base: R$ " + estagiario.salarioBase);
        System.out.println("Salario Final: R$ " + estagiario.calcularSalario());
    }
}
