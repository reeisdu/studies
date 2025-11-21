import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        
        int n = 1, n2 = 52;
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("Números de um a 50 num intervalo de um em um");
        System.out.println("");

        while (n <= 50) {
            System.out.println(n);
            n = n + 1;
            if (n == 51) {
                break;
            }       
        }
        
        System.out.println("------------------------------------------------");
        System.out.println("");
        System.out.println("Agora, de 52 a 100 num intervalo de dois em dois");
        System.out.println("");
        System.out.println("------------------------------------------------");

        while (n2 <= 100) {
            System.out.println(n2);
            n2 = n2 + 2;
            if (n2 == 101) {
                break;
            }
        }
    entrada.close();
    }
}
