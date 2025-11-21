import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n;
        double soma = 0;

        
        System.out.print("Digite um valor inteiro e positivo para n: ");
        n = entrada.nextInt();

        if (n <= 0) {
            System.out.println("O valor deve ser positivo!");
        } else {
            int i = 1;
            while (i <= n) {
                soma += 1.0 / i;
                i++;
            }
            
            System.out.println("A soma S = " + soma);
        }
        
        entrada.close();
    }
}