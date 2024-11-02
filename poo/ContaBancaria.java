package poo;

public class ContaBancaria {
    private double saldo;
    private int numero;

    // Construtor para inicializar o número da conta e o saldo inicial
    public ContaBancaria(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    // Método para acessar o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar um valor no saldo
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
}

