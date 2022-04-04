package Calculadora;

import java.util.Scanner;

public class calc {
    public static int soma(int a, int b) {
        int calc = a + b;
        return calc;
    }

    public static float divisao(int a, int b) {
        float calc = a / b;
        return calc;
    }

    public static int subtracao(int a, int b) {
        int calc = a - b;
        return calc;
    }

    public static int multiplicacao(int a, int b) {
        int calc = a * b;
        return calc;
    }

    public static void main(String[] args) {
        System.out.println("Por favor, digite uma das operações de cálculo abaixo:");
        System.out.println("Digite 1 para Somar");
        System.out.println("Digite 2 para Subtrair");
        System.out.println("Digite 3 para Dividir");
        System.out.println("Digite 4 para Multiplicar");

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();

        System.out.println("Digite o primeiro Número");
        int a = entrada.nextInt();

        System.out.println("Digite o segundo Número");
        int b = entrada.nextInt();

        if (n == 1) {
            System.out.println("A soma dos números é igual a: " + soma(a, b));
        }
        if (n == 2) {
            System.out.println("A Subtração dos números é igual a: " + subtracao(a, b));
        }
        if (n == 3) {
            System.out.println("A divisão dos números é igual a: " + divisao(a, b));
        }
        if (n == 4) {
            System.out.println("A Multiplicação dos números é igual a: " + multiplicacao(a, b));
        }

        entrada.close();
    }
}