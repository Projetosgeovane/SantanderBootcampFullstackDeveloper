package desafiosNumericosEmJava;

import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);

        int valor1 = teclado.nextInt();

        int valor2 = teclado.nextInt();


        double valor3 = teclado.nextDouble();

        double salary = valor2 * valor3; // Altere o valor da variável com o cálculo esperado
        System.out.println("NUMBER = " + valor1);
        System.out.printf("SALARY = U$ %.2f", salary);
    }
}
