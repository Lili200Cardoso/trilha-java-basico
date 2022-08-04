package edu.lili.primeirasemana;

public class Operadores {
    public static void main(String[] args) {

        int numero = 5;
        //++ no sufixo:
        /*System.out.println(numero++);//O Número é incrementado, mas só aparece com o incremento na segunda chamada;
        System.out.println(numero);//S[o nesse momento realmente o incremento acontece;
*/
        //++ no prefixo
        System.out.println(++ numero);//O incremento acontece imediatamente
        System.out.println(numero);


        //TERNÁRIO:

       int a, b;
       a = 5;
       b = 6;
       //Declaração com estrutura IF/Else:
       String resultado = "";
       if(a == b)
           resultado = "verdadeiro";
       else
           resultado = "falso";
        System.out.println(resultado);

        //Aplicabilidade do operador ternário:
       //String resultado = a==b ?"verdadeiro : "falso";


        //OPERADORES LÓGICOS
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condiçoes são verdadeiras...");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira...");
        }




    }
}
