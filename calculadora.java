import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String opcao;


        System.out.println("Este programa realiza a função de calculadora");

        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 -  para multiplicar.");
        System.out.println("4 - para dividir.");
        System.out.println("5 - Sair");
        opcao = ler.next();




         System.out.println("numero");
         int n1 = ler.nextInt();
         System.out.println("numero");
         int n2 = ler.nextInt();
         System.out.println("numero");
         int n3 = ler.nextInt();    
         System.out.println("Digite o quarto número");
         int n4 = ler.nextInt();



        if (opcao.equalsIgnoreCase("somar")) 
            System.out.println("O total da Soma é:" + (n1 + n2+n3+n4));

        if (opcao.equalsIgnoreCase("subtrair"))
            System.out.println("O total da subtração é:" + (n1 - n2-n3-n4));

        if (opcao.equalsIgnoreCase("multiplicar"))
            System.out.println("A multiplicação é: " + (n1 * n2*n3*n4));

        if (opcao.equalsIgnoreCase("dividir"))
            System.out.println("A divisão é: " + (n1 / n2/n3/n4));

         if(opcao.equalsIgnoreCase("sair")) 
            System.out.println("Você escolheu sair do programa:");

        ler.close();
    }
}