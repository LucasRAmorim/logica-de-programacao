package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome de usuario");
        String nome = input.next();

        if(nome.equals(null)  || nome.equals("")) {
            System.out.println("O nome de usuario não pode estar em branco");
        }else if (nome.equalsIgnoreCase("administrador")  || nome.equalsIgnoreCase("admin") ){
            System.out.println("Admin/admin sao nomes de usuario reservados pelo sistema");
        }else {
            System.out.println("Usuario "+nome +" cadastrado com sucesso");
        }
    }
}

