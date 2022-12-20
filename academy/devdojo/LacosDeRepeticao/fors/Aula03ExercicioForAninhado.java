package academy.devdojo.LacosDeRepeticao.fors;

public class Aula03ExercicioForAninhado {
    public static void main(String[] args) {
        for (int i = 1;i <=10 ; i++) {
            System.out.println("----------------------");
            System.out.println("Tabuada do " +i);
            for (int j = 1;j <= 10 ; j++) {
                System.out.println("multiplição de " +i +" por " +j);
                System.out.println(j * i);
            }
        }
    }
}
