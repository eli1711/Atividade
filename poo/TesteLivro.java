package poo;

public class TesteLivro {
    public static void main(String[] args) {
        // Instanciação de objetos da classe Livro
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1056);
        Livro livro2 = new Livro("1984", "George Orwell", 328);

        // Exibindo as informações dos livros
        livro1.exibirDetalhes();
        System.out.println();
        livro2.exibirDetalhes();
    }
}
