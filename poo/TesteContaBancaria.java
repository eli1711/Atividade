package poo;

public class TesteContaBancaria {
    public static void main(String[] args) {
        // Criando uma conta bancária com o número 12345
        ContaBancaria conta = new ContaBancaria(12345);

        // Realizando operações de depósito e verificando o saldo
        conta.depositar(500.0);
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        conta.depositar(300.0);
        System.out.println("Saldo atualizado: " + conta.getSaldo());

        // Tentando depositar um valor inválido
        conta.depositar(-100.0);
        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
