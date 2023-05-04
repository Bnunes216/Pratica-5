import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = input.nextInt();

        System.out.print("Números ímpares de 1 até " + numero + ": ");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
