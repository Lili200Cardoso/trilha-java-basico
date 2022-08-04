package Metodos;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(5);

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal da TV: " + smartTv.canal);
        System.out.println("Qual o volume da TV: " + smartTv.volume);



        smartTv.ligar();
        System.out.println("Novo status -> A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> A TV está ligada? " + smartTv.ligada);

    }
}
