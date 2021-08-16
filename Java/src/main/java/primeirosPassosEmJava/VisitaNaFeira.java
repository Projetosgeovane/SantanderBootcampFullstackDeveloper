package primeirosPassosEmJava;

import java.util.Scanner;

public class VisitaNaFeira {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int total = a + b; // Altere o valor da variável com o cálculo esperado
        System.out.println("X = " + total);

        teclado.close();
    }
}
