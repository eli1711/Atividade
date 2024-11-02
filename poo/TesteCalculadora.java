package poo;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Testando os métodos da Calculadora
        double soma = calculadora.somar(10, 5);
        double subtracao = calculadora.subtrair(10, 5);
        double multiplicacao = calculadora.multiplicar(10, 5);
        double divisao = calculadora.dividir(10, 5);
        double divisaoPorZero = calculadora.dividir(10, 0);

        // Exibindo os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Divisão por zero: " + divisaoPorZero);
    }
}
