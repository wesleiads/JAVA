import java.util.Scanner;

public class riddle {

    public static void main(String[] args) {
        int loop = 0;
        int tentativa = 0;
        int palpite = 0;
        int num = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Adivinhe o número entre 0 a 100:\n");

        num = (int) (Math.random() * 101);

        tentativa = 10;// setado a quantidade de tentativas
        loop = 10;// quantidade de vezes que será comparado o Random abaixo &&

        while (palpite != num && loop > 0) {// !=diferente e && comparação       
            palpite = entrada.nextInt();

            tentativa--;// --diminuindo a sequencia de tentativas 9,8,7,6....
            if (palpite < 0) {// must be positive number
                System.out.println("O número precisa ser positivo!");
            }

            else if (num < palpite) {
                // --dimuinui a sequencia de comparacao
                System.out.println("O número é menor, você tem mais " + tentativa + " tentativas: ");

            } else if (num > palpite) {
                loop--;
                System.out.println("O número é maior, você tem mais " + tentativa + " tentativas: ");
            }
        }

            if (palpite == num) {// ==igualdade
            System.out.println("\nParabéns! Você acertou o número sorteado: " + num);
            

           } else if (loop == 0) {
            System.out.println("\nVocê perdeu! O número sorteado foi: " + num+"\n");
            
           
        }
        entrada.close();
    }
}

// referencias da aula 1, slide 16 Operadores
// https://www.programiz.com/article/increment-decrement-operator-difference-prefix-postfix