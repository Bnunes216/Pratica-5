import java.util.Scanner;

public class PessoasSexoPeso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countHomens = 0;
        int countMulheres = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o sexo da pessoa " + i + " (M ou F): ");
            String sexo = input.next();

            System.out.print("Digite o peso da pessoa " + i + ": ");
            double peso = input.nextDouble();

            if (sexo.equalsIgnoreCase("M") && peso >= 60 && peso <= 80) {
                countHomens++;
            } else if (sexo.equalsIgnoreCase("F") && peso >= 50 && peso <= 70) {
                countMulheres++;
            }
        }

        System.out.println("Quantidade de homens com peso entre 60 e 80 kg: " + countHomens);
        System.out.println("Quantidade de mulheres com peso entre 50 e 70 kg: " + countMulheres);
    }
}