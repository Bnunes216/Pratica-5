import java.util.Scanner;

public class Idade {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int idade = 0, media = 0, posicao = 0, idadeTotal = 0, cadastro = 0;

    for(posicao = 0; idade >= 0; posicao++){
        posicao++;
        cadastro++;
        System.out.println("\ninforme sua Idade:");
        idade = in.nextInt();

        idadeTotal = idadeTotal + idade;

        media = idadeTotal / cadastro;

        System.out.println("\nCadastro: " + cadastro + 
        "\nidade: " + idade + 
        "\nMedia das idades ate o momento: " + media);
    } 
    System.out.println("\nMedia das idades: " + media );
    }
}