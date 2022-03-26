import java.util.Scanner;
public class Parimpar {
    public static String verificapar(int n) {
        if (n % 2 == 0){
            return "Par";  
        } else {
            return "Impar";
        }
    }
    public static void main(String[] args) {
     //mostrar mensagem para o usuario
     System.out.println("Digite um Número");
     Scanner entrada = new Scanner(System.in);
     int n;
     //tipo não primitivo not char - float
     //ler um numero digitado no teclado
     do{
         n = entrada.nextInt();
         if (n >= 0) {
            System.out.println (verificapar(n));
         }
    }   while (n >= 0);
     //mostrar o nome do mes
     //usando if
     //usando switch
     //chama a classe definida 
     entrada.close();     
    }
        
}