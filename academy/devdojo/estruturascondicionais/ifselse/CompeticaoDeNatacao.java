package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class CompeticaoDeNatacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do participante");
        String nome = teclado.next();
        System.out.println("Digite a idade do participante");
        int idade = teclado.nextInt();
        if(idade < 11) {
            System.out.println(nome + " participara da competicao na categoria infantil");
        }else if(idade <= 11 && idade <= 15){
            System.out.println(nome + " participara da competicao na categoria juvenil");
        }else if(idade <= 16 && idade <= 19) {
            System.out.println(nome + " participara da competicao na categoria pre-adulto");
        }else{
            System.out.println(nome + " participara da competicao na categoria adulto");
        }

    }
}
