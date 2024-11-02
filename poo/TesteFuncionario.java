package poo;

public class TesteFuncionario {
    public static void main(String[] args) {
        // Criando um objeto Funcionario
        Funcionario funcionario = new Funcionario(3000);
        System.out.println("Salário do Funcionário: " + funcionario.calcularSalario());

        // Criando um objeto Gerente com bônus
        Gerente gerente = new Gerente(5000, 1500);
        System.out.println("Salário do Gerente: " + gerente.calcularSalario());
    }
}
