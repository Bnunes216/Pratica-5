import java.util.Scanner;

public class TabuadaMultiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
        }

        scanner.close();
    }
}
