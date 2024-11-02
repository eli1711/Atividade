package poo;

public class Funcionario {
    protected double salarioBase;

    // Construtor da classe Funcionario
    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método para calcular o salário (padrão para um funcionário)
    public double calcularSalario() {
        return salarioBase;
    }
}

