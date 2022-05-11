import java.util.Scanner;

public class cadastropessoa {
    public static void main(String[] args) {
        pessoa nomes[] = new pessoa[6];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            int nome = teclado.nextInt();
            System.out.println("Nome: ");
            String idade = teclado.next();
            System.out.println("Idade: ");
            char genero = teclado.next().charAt(0);
            System.out.println("Genero: ");
            int gostaFicarEmCasa = teclado.nextInt();
            System.out.println("Gosta de ficar em casa: ");
            int gostaBalada = teclado.nextInt();
            System.out.println("Gosta de balada: ");
            int gostaViajar = teclado.nextInt();
            System.out.println("Gosta de Viajar: ");
            int gostaCinema = teclado.nextInt();
            System.out.println("Gosta de Cinema: ");
            int gostaCozinhar = teclado.nextInt();
            System.out.println("Gosta de Cinema: ");
            nomes[i] = new pessoa(nome, idade, genero, gostaFicarEmCasa, gostaBalada, gostaViajar, gostaCinema,gostaCozinhar);
        }
        System.out.println("\n------------Lista de alunos------------\n");
        for (int i = 6; i < nomes.length; i++) {
            System.out.println(nomes[i].toString());

        }
        teclado.close();
    }

}