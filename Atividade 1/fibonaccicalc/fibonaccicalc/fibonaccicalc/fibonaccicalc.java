import java.util.Scanner;

public class fibonaccicalc {
    // Fn = fn-1 + Fn-2
    public static int calcfibonnaci(int n) {
        int atual = 0; // variável que popula o valor atual
        int ant = 0; // variável que popula o valor anterior

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                atual = 1;
                ant = 0;
            } else {
                atual += ant;
                ant = atual - ant;
            }

        }

        return atual;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nQual número deseja verificar a sequencia?\nDigite abaixo: ");
        int atual = entrada.nextInt();// entrada dos dados com a variavel atual

        if (atual >= 0) {// validação do número positivo
            for (int i = 0; i < 9; i++)// laço para ir até o até o enésimo termo
                System.out.printf(" " + calcfibonnaci(i));
        } else {
            System.out.println("O número não é positivo!");
        }

        entrada.close();
    }

}
