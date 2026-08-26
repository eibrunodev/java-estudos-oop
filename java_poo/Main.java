package java_poo;
public class Main {
    public static void main(String[] args) {
        Carro carro = new Sandero();
        Carro carro2 = new Mobi();
        SerVivo humano = new Humano();

        humano.dormir();
        humano.respirar();

        carro.acelerar();
        carro2.acelerar();
    }
}
