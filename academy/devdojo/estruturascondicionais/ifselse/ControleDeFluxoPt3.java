package academy.devdojo.estruturascondicionais.ifselse;

public class ControleDeFluxoPt3 {
    public static void main(String[] args) {
        float salario = 3500;
        float resultado = 0F;
                if (salario > 4500) {
                    resultado = (salario * 0.3F);

                } else {
                    resultado = (salario * 0.15F);
                }
        System.out.println("o resultado eh " +resultado);
    }
}
