package academy.devdojo.LacosDeRepeticao.whiles;

import java.util.Scanner;

public class Aula04Login {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuario = "EasyFire";
        String senha = "1234";
        System.out.println("insira o nome de usuario");
        String login = teclado.next();
        System.out.println("insira a senha");
        String password = teclado.next();
        while ((login != usuario) && (password != senha)) {
            System.out.println("Acesso negado");
            System.out.println("insira o nome de usuario");
            login = teclado.next();
            System.out.println("insira a senha");
            password = teclado.next();
            if ((login.equalsIgnoreCase(usuario)) && (password.equalsIgnoreCase(senha))) {
                System.out.println("Acesso Concedido");
                break;

            }
        }

    }
}
