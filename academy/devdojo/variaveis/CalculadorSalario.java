package academy.devdojo.variaveis;

public class CalculadorSalario {
    public static void main (String[] args){
        double salario = 2500F;
        float porcentagem30 = 30;
        double trintaPorcentoDoSalario = salario * (porcentagem30 / 100F);
        System.out.println(trintaPorcentoDoSalario);
        float porcentagem15 = 15;
        double quinzePorcentoDeTrinta = trintaPorcentoDoSalario * (porcentagem15 / 100F);
        System.out.println(quinzePorcentoDeTrinta);
        float porcentagem5 = 5;
        double cincoPorcentoDeQuinze = quinzePorcentoDeTrinta * (porcentagem5 / 100F);
        System.out.println(cincoPorcentoDeQuinze);

        double salarioExercicio = 2500F;
        float porcentagem30Exercicio = 30;
        double resultado = salarioExercicio * (porcentagem30Exercicio / 100F);
        System.out.println(resultado);

        float porcentagem15Exercicio = 15;
        resultado = salarioExercicio * (porcentagem15Exercicio / 100F);
        System.out.println(resultado);

        float porcentagem5Exercicio = 5;
        resultado = salarioExercicio * (porcentagem5Exercicio / 100F);
        System.out.println(resultado);
    }
}
