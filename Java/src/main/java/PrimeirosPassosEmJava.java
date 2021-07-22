import java.util.Scanner;

public class PrimeirosPassosEmJava {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int total = a + b;
        System.out.println("X = " + total);

        teclado.close();
    }
}
