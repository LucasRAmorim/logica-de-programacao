package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class Aula01DiasDaSemana {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um numero para ver o dia da semana correspondente");
        int dia = numero.nextInt();
        switch (dia) {
            case 1:
                System.out.println("O numero " +dia +" corresponde a Domingo");
                break;
            case 2:
                System.out.println("O numero " +dia +" corresponde a Segunda");
                break;
            case 3:
                System.out.println("O numero " +dia +" corresponde a Terca");
                break;
            case 4:
                System.out.println("O numero " +dia +" corresponde a Quarta");
                break;
            case 5:
                System.out.println("O numero " +dia +" corresponde a Quinta");
                break;
            case 6:
                System.out.println("O numero " +dia +" corresponde a Sexta");
                break;
            case 7:
                System.out.println("O numero " +dia +" corresponde a Sabado");
                break;
            default: System.out.println("Dia Invalido");

        }
    }
}
