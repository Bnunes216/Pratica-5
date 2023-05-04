import java.util.Scanner;

public class Maior {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);  
        int posicao = 0, numero = 0, maior = 0, menor = 0;

        for(posicao = 0; posicao >= 0; posicao++){
            System.out.println("Informe um numero: ");
            numero = in.nextInt();

            if(maior < numero){
                maior = numero;
            }

            if(menor > numero){
                menor = numero;
            }else if(menor == 0){
                menor = numero;
            }

            System.out.println("\nNumero atual: " + numero + 
            "\nMaior numero ate o momento: " + maior + 
            "\nMenor numero ate o momento: " + menor);
        }
    }
}