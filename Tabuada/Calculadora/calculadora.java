package Calculadora;

import java.util.Scanner;

public class calculadora {

       public static void main(String[] args){
       Scanner teclado = new Scanner(System.in);
       String operacao;
        

        System.out.println("Escolha a operação desejada para o Cálculo:");
        System.out.println("1 para Somar");
        System.out.println("2 para Subtrair");
        System.out.println("3 para multiplicar");
        System.out.println("4 para dividir");
        System.out.println("X para Sair");
        operacao= teclado.next();

         System.out.println("Digite o primeiro número");
         int a = teclado.nextInt();
         System.out.println("Digite o segundo número");
         int b = teclado.nextInt();
         
        if (operacao.equalsIgnoreCase("1"))
            System.out.println("O resultado da Soma é: " + (a + b));
        
        if (operacao.equalsIgnoreCase("2"))
            System.out.println("O resultado da subtração é: " + (a - b));

        if (operacao.equalsIgnoreCase("3"))
            System.out.println("O resultado da multiplicação é: " + (a * b));

        if (operacao.equalsIgnoreCase("4"))
            System.out.println("O resultado da divisão é: " + (a / b));

         if(operacao.equalsIgnoreCase("x")) 
            System.out.println("Programa encerrado!");

         teclado.close();
    }
}