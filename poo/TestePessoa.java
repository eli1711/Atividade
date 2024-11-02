package poo;

public class TestePessoa {
    public static void main(String[] args) {
        // Instanciação de objetos da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Ana", 25);
        Pessoa pessoa2 = new Pessoa("Carlos", 30);

        // Exibindo as informações das pessoas
        pessoa1.exibirInformacoes();
        System.out.println();
        pessoa2.exibirInformacoes();
    }
}
