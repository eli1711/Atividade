package poo;

public class Computador {
    private Processador processador;
    private Memoria memoria;

    // Construtor da classe Computador que recebe Processador e Memoria como parâmetros
    public Computador(Processador processador, Memoria memoria) {
        this.processador = processador;
        this.memoria = memoria;
    }

    // Método para exibir as características completas do computador
    public void exibirCaracteristicas() {
        System.out.println("Características do Computador:");
        processador.exibirDetalhes();
        memoria.exibirDetalhes();
    }
}
