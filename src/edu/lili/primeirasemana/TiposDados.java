package edu.lili.primeirasemana;

import java.util.Date;

public class TiposDados {
    public static void main(String[] args) {
        //TIPOS PRIMITIVOS, SÃO 8:
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;//Se começar com zero, talvez tenha que ser de oytro tipo(String);
        long cpf = 98765432109L;//Se começar com zero, talvez tenha que ser de outro tipo;
        float pi = 3.14F;
        double salario = 1275.33;
        boolean logica = true;
        char caracter = 'A';

        String meuNome = "Lili Cardoso"; //String(Objeto)
        Date dataNascimento = new Date(); //Date(Classe)
    }
}
