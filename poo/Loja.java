package poo;

public class Loja {

    // Método calcularPreco com preço base e quantidade
    public double calcularPreco(double precoBase, int quantidade) {
        return precoBase * quantidade;
    }

    // Método calcularPreco com preço base, quantidade e desconto percentual
    public double calcularPreco(double precoBase, int quantidade, double descontoPercentual) {
        double precoTotal = precoBase * quantidade;
        double desconto = precoTotal * (descontoPercentual / 100);
        return precoTotal - desconto;
    }
}
