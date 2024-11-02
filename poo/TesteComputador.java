package poo;

public class TesteComputador {
    public static void main(String[] args) {
        // Criando objetos de Processador e Memoria
        Processador processador = new Processador("Intel Core i5", 2.5);
        Memoria memoria = new Memoria(16);

        // Criando o objeto Computador com o processador e a memória
        Computador computador = new Computador(processador, memoria);

        // Exibindo as características completas do computador
        computador.exibirCaracteristicas();
    }
}
