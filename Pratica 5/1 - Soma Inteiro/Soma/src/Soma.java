import java.util.Scanner;

public class Soma {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int soma = 0;

        for(int i = 7; i <= 20; i++){
            soma = soma + i;

            
        }System.out.println("As somas dos numeros inteiros de 7 a 20 são: " + soma);
    }
}
