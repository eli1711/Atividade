package poo;

public class Memoria {
    private int capacidade; // em GB

    // Construtor da classe Memoria
    public Memoria(int capacidade) {
        this.capacidade = capacidade;
    }

    // Método para exibir os detalhes da memória
    public void exibirDetalhes() {
        System.out.println("Memória RAM: " + capacidade + " GB");
    }
}
