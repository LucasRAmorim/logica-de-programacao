package academy.devdojo.LacosDeRepeticao.whiles;

import java.util.Scanner;

public class LacosDeRepeticaoAula2 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int numerosASeremImpressos = 0;
        System.out.println("Digite um numero");
        int numeroDigitadoPeloUsuario = numero.nextInt();

        while (numerosASeremImpressos <= numeroDigitadoPeloUsuario) {
            numerosASeremImpressos = numerosASeremImpressos + 1;
            if ((numerosASeremImpressos % 2) > 0) {
                System.out.println(numerosASeremImpressos);
            }
        }



    }
}
