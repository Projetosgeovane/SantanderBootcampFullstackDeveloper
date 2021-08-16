package primeirosPassosEmJava;

import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int i = 0;

        while(i < 6){
            if(x % 2 == 1){
                System.out.println(x);
                i++;
            }
            x++;
        }
        leitor.close();

    }
}
