package academy.devdojo.Arrays;

public class Aula03Exercicio01 {
    public static void main(String[] args) {
        int[][] matrizMultiDimencional = new int[3][3];
        matrizMultiDimencional[0][0] = 22;
        matrizMultiDimencional[0][1] = 11;
        matrizMultiDimencional[0][2] = 4;
        matrizMultiDimencional[1][0] = 44;
        matrizMultiDimencional[1][1] = 55;
        matrizMultiDimencional[1][2] = 22;
        matrizMultiDimencional[2][0] = 2;
        matrizMultiDimencional[2][1] = 5;
        matrizMultiDimencional[2][2] = 21;
        int resultadoMultiplicacaoDiagonal = 1;
        for (int i = 0; i < matrizMultiDimencional.length; i++) {
            for (int j = 0; j < matrizMultiDimencional[i].length; j++) {
                if (i == j) {
                    resultadoMultiplicacaoDiagonal = resultadoMultiplicacaoDiagonal * matrizMultiDimencional[i][j];
                }
                System.out.println(resultadoMultiplicacaoDiagonal);
            }
        }

    }
}
