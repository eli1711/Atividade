package poo;

public class Gerente extends Funcionario {
    private double bonus;

    // Construtor da classe Gerente
    public Gerente(double salarioBase, double bonus) {
        super(salarioBase);
        this.bonus = bonus;
    }

    // Sobrescrevendo o método calcularSalario para incluir o bônus
    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}
