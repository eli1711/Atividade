package poo;

public class TesteLoja {
    public static void main(String[] args) {
        Loja loja = new Loja();

        // Testando o cálculo sem desconto
        double precoSemDesconto = loja.calcularPreco(100.0, 5);
        System.out.println("Preço sem desconto: " + precoSemDesconto);

        // Testando o cálculo com desconto
        double precoComDesconto = loja.calcularPreco(100.0, 5, 10.0);
        System.out.println("Preço com desconto de 10%: " + precoComDesconto);
    }
}
