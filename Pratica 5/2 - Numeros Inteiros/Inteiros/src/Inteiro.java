import java.util.Scanner;

public class Inteiro {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n1, n2;
        
        do{
            System.out.println("Digite o primeiro numero Inteiro: ");
            n1 = in.nextInt();
        }while(n1 <= 0);

        do{
            System.out.println("\nInforme o Segundo numero inteiro: \n");
            n2 = in.nextInt();
        }while(n2 <= 0);

    if(n1 < n2){
        for(int i = n1; i <= n2; i++ ){
            
            System.out.println("\n" + i); 
            }
    }else if(n1 > n2){
        for(int i = n2; i <= n1; i++ ){
        
            System.out.println("\n" + i);
            }

        }
    }
}
