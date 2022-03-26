import java.util.Random;

public class sorteio {
    //Variaveis globais
    //funcoes e procedimentos
    //Rotina princial
    public static void main(String[]args) {/*Void quando a função tem retorno */
        Random gerador = new Random();/*new cria um objeto a partir de uma classe*/
        int c = 1;
        int soma = 0;  
        int maior =0;//pode inicilizar com 1 ou 0
        int menor = 101;//ou 100
        while (c <= 1000){//laço de interação
            //ler o numero
            c++; //c += 1 ou c = c + 1
            int n = 1 + gerador.nextInt(100);
            soma += n;//soma = soma + n
           
            if (n > maior){
                maior =n;
            }
            if (n < menor){

            }
        
            System.out.println(n);
            System.out.println("Maior="+soma);
            System.out.println("Menor="+menor);
            System.out.println("Média="+soma/1000f);//soma / (float) 1000;
        }
        
         
    }
    
}
//Type Cast --- Conversão de tipos
// int -----> float
//     <-----