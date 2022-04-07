package teste;
import java.util.Scanner;
import java.util.Random;

public class Sorteio {
     //Atributos e variaveis
     public static Scanner teclado;
     public static int[] vetor;
    //funcoes e procedimentos
    public static void sortear(){
        Random gerador = new Random();
        vetor = new int[20];
        for(int i=0; i< vetor.length;i++){
             vetor[i]=gerador.nextInt(100)+1;//para somar mais 1 de 0 a 99
        }
    }
    public static int procurar (int n){
        for (int i=0; i< vetor.length; i++){
            if (vetor[i]==n){
                return i;
            }
        }
        return -1;
    }
    //Rotina princial
    public static void main(String[]args){
        sortear();
        teclado = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = teclado.nextInt();
        int pos = procurar(num);
        if (pos >=0){
            System.out.printf("numero encontrado na posição %d",pos);
        } else {
            System.out.println("Numero não encontrado");
        }
        teclado.close();
    }

}