package academy.devdojo.LacosDeRepeticao.fors;

import java.util.Scanner;

public class Aula02Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para ver a sua tabuada de 1 a 10");
        int numero = 1;
        while (numero >= 1 && numero <= 1000) {
            for (int i = 1;i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(resultado);
            }
            if (numero >= 1000) ;
            numero = numero + 1;
            System.out.println("------------------------");
        }
    }
}
