import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a base (um número inteiro): ");
        int base = sc.nextInt();
        
        System.out.print("Digite o expoente (um número inteiro não negativo): ");
        int expoente = sc.nextInt();
        
        int potencia = 1;
        for (int i = 1; i <= expoente; i++) {
            potencia *= base;
        }
        
        System.out.println(base + "^" + expoente + " = " + potencia);
        
        sc.close();
    }
}