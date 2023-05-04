import java.util.Scanner;

public class PessoasSexoIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countMulheres = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = input.nextInt();

            System.out.print("Digite o sexo da pessoa " + i + " (M ou F): ");
            String sexo = input.next();

            if (sexo.equalsIgnoreCase("F") && idade >= 20 && idade <= 40) {
                countMulheres++;
            }
        }

        System.out.println("Quantidade de mulheres entre 20 e 40 anos: " + countMulheres);
    }
}