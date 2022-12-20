package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("voce eh do sexo: ");
        String sexo = input.next();
        if(sexo.equalsIgnoreCase("M")  ||  sexo.equalsIgnoreCase("masculino")) {
            System.out.println("Qual sua idade? ");
            int idade = input.nextInt();
            if (idade < 18) {
                System.out.println("Alistamento nao permitido");
            } else {
                System.out.println("Alistamento obrigatorio");
            }
        }else if (sexo.equalsIgnoreCase("F")  ||  sexo.equalsIgnoreCase("feminino")) {
            System.out.println("Qual sua idade? ");
            int idade = input.nextInt();
            if (idade < 18) {
                System.out.println("Alistamento nao permitido");
            }else {
                System.out.println("Voce deseja se alistar?");
            } String desejaAlistar = input.next();
            if (desejaAlistar.equalsIgnoreCase("S")  ||  desejaAlistar.equalsIgnoreCase("sim")){
                System.out.println("Preencha o formulario para se alistar");
            }else {
                System.out.println("Nao alistada :)");
            }
        }else {
            System.out.println("insira M ou F para definir o seu sexo");
        }

    }
}
