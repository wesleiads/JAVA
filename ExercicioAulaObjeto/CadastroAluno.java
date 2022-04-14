import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        aluno alunos[] = new aluno[3];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("\n--------------Aluno %d------------\n", i + 1);
            System.out.println("RGM: ");
            int RGM = teclado.nextInt();
            System.out.println("Nome: ");
            String nome = teclado.next();
            System.out.println("Ano: ");
            int anoIngresso = RGM = teclado.nextInt();
            alunos[i] = new aluno(RGM, nome, anoIngresso);

        }
        System.out.println("\n------------Lista de alunos------------\n");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i].toString());

        }
        teclado.close();
    }

}