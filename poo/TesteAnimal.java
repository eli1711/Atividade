package poo;

public class TesteAnimal {
    public static void main(String[] args) {
        // Instanciação de objetos das classes derivadas
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        // Chamando o método fazerSom() para cada objeto
        cachorro.fazerSom();
        gato.fazerSom();
    }
}
