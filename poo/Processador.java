package poo;

public class Processador {
    private String modelo;
    private double velocidade; // em GHz

    // Construtor da classe Processador
    public Processador(String modelo, double velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    // Método para exibir os detalhes do processador
    public void exibirDetalhes() {
        System.out.println("Processador: " + modelo);
        System.out.println("Velocidade: " + velocidade + " GHz");
    }
}
