package Integer_Number;

import java.util.Scanner;

public class FactIntegerNumber {
  public static void main(String[] args) {
    System.out.println("Digite o número que deseja calcular o (n!)fatorial: ");
    Scanner entrada = new Scanner(System.in);
    int n = entrada.nextInt();
    int fact = 1;

    if (n>=0) {//número precisa ser positivo
      for (int i = 1; i <= n; i++) {
      fact *= i;
      }
       System.out.printf("O fatorial do número %d é %d: ",n , fact);
    } else {
      System.out.printf("O número %d não é positivo!",n);
    }
    entrada.close();
  }

}