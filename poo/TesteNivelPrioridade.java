package poo;

public class TesteNivelPrioridade {
    public static void main(String[] args) {
        // Exibindo o nome e o código de cada nível de prioridade
        for (NivelPrioridade nivel : NivelPrioridade.values()) {
            nivel.exibirPrioridade();
        }
    }
}
