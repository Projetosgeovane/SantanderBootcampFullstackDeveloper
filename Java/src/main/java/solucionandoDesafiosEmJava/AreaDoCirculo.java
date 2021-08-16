package solucionandoDesafiosEmJava;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //declare suas variaveis do tipo double
        final double pi;
        double raio;
        double area;

        pi = 3.14159;

        raio = scan.nextDouble();

        area = pi * (Math.pow(raio ,2.0));

        System.out.printf("A=%.4f\n", area);
    }
}
