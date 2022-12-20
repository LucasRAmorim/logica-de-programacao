package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class TipoDeContaNoBanco {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite 1 para informaçoes da conta poupança, 2 para informaçoes da conta corrente, 3 para informaçoes da conta de investimentos.");

        int numeroDaConta = numero.nextInt();
        switch (numeroDaConta) {
            case 1:
                System.out.println("Conta Poupança, taxa de 0.05% de juros ao mês");
                break;
            case 2:
                System.out.println("Conta Poupança, taxa de 0.02% de juros ao mês");
                break;
            case 3:
                System.out.println("Conta de investimentos, taxa de 0.1% de juros ao mês");
                break;
            default:
                System.out.println("Numero invalido");
        }

    }
}
