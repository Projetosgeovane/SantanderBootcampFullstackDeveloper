import java.util.Scanner;

public class QuantidadeDeNumerosPositivos {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int positivo, i;
        Double x;
        positivo = i = 0;

        while(i < 6){
            x = teclado.nextDouble();

            if(x > 0.0){
                positivo++;
            }
            i++;
        }
        System.out.println("" + positivo + " valores positivos");

        teclado.close();

    }
}
