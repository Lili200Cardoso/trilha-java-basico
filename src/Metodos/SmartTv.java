package Metodos;

/*Vamos criar um exemplo de uma classe para representar uma SmarTv onde:
1. Ela tenha as característica: ligada(boolean), canal(int) e volume(int)
2. Nossa TV poderá liagar e desligar e assim mudar o estado ligada
3. Nossa TV aumentará e diminuirá o volume sempe em +1 ou -1
4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente*/

public class SmartTv {//Descrevendo os atributos da nossa classe:
    boolean ligada = false;
    int canal = 12;
    int volume = 10;


    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}



