import java.util.Scanner;

public class Idade {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int pessoa = 0, posicao = 0, idade, totalIdade = 0, mediaIdade = 0;

        for(pessoa = 0; pessoa <= 10; pessoa++ ){
            
            posicao++;
            pessoa = posicao;

            System.out.println("\nInforme a idade " + posicao);
            idade = in.nextInt();

            totalIdade = totalIdade + idade;
            mediaIdade = totalIdade /pessoa;

            
        } System.out.println("Media das idades: " + mediaIdade);

    }

}