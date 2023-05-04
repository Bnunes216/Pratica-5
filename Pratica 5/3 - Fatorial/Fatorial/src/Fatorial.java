import java.util.Scanner;
public class Fatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro não negativo: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("Número inválido. Digite um número inteiro não negativo.");
        } else {
            int fatorial = 1;
            for (int i = 2; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println(n + "! = " + fatorial);
        }
        
        sc.close();
    }
}