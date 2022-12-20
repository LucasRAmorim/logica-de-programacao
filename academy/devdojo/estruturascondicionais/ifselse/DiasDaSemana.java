package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um numero para ver o dia da semana correspondente");
        int numeroDaSemana = numero.nextInt();

        if (numeroDaSemana == 1){
            System.out.println("O numero " +numeroDaSemana +" corresponde a Domingo");
        }else if (numeroDaSemana == 2){
            System.out.println("O numero " +numeroDaSemana +" corresponde a Segunda");
        }else if (numeroDaSemana == 3){
            System.out.println("O numero " +numeroDaSemana +" corresponde a Terca");
        }else if (numeroDaSemana == 4){
            System.out.println("O numero " +numeroDaSemana +" corresponde a Quarta");
        }else if (numeroDaSemana == 5){
            System.out.println("O numero " +numeroDaSemana +" corresponde a Quinta");
        }else if (numeroDaSemana == 6){
            System.out.println("O numero " +numeroDaSemana +" corresponde a Sexta");
        }else if (numeroDaSemana == 7){
            System.out.println("O numero 0" +numeroDaSemana +" corresponde a Sabado");
        }else {
            System.out.println("Digite um numero entre 1 e 7");
        }

    }
}
