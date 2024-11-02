package poo;

public enum NivelPrioridade {
    BAIXO(1), 
    MEDIO(2), 
    ALTO(3), 
    URGENTE(4);

    private int codigo;

    // Construtor da enumeração NivelPrioridade
    NivelPrioridade(int codigo) {
        this.codigo = codigo;
    }

    // Método para exibir o nome e o código do nível de prioridade
    public void exibirPrioridade() {
        System.out.println("Prioridade: " + this.name() + " - Código: " + codigo);
    }

    // Getter para o código, caso precise ser usado externamente
    public int getCodigo() {
        return codigo;
    }
}
