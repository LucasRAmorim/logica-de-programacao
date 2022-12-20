package academy.devdojo.estruturascondicionais.ifselse;

public class ImparOuPar {
    public static void main(String[] args) {
        int numero = 12;
        int divisor = 2;

        if ((numero % 2) == 0){
            System.out.println("O "+numero +" eh par");
        } else {
            System.out.println("O "+numero +" eh impar");
        }
    }
}
