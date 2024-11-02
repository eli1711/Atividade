package poo;

public class TesteVeiculo {
    public static void main(String[] args) {
        // Instanciação de objetos das classes Carro e Bicicleta
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        // Chamando o método mover() para cada objeto
        carro.mover();
        bicicleta.mover();
    }
}
