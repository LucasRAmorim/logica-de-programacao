package academy.devdojo.LacosDeRepeticao.whiles;

import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("1. Calcular Imposto, 2. Depositar Salario, 3. Sair");
        int opcao = numero.nextInt();

        while (opcao != 3) {
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar Salario");
            System.out.println("Saindo do menu");
            opcao = numero.nextInt();
        }
        System.out.println("programa encerrado");

    }
}
