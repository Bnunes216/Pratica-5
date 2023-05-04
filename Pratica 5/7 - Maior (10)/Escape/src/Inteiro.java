import java.util.Scanner;

public class Inteiro {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int posicao = 1, numero = 0, maior = 0, menor = 0;

        for(posicao = 1; posicao <= 10; posicao++){
            System.out.println("\nInforme um numero inteiro: ");
            numero = in.nextInt();

            if(maior < numero){
                maior = numero;
            }

            if(menor > numero){
                menor = numero;
            }

        } System.out.println("\nA maior Nota é: " + maior + 
        "\nMenor Nota é: " + menor);
    }
}