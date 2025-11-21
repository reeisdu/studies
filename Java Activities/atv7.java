import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int z;
        int numPosit = 0;
        int numNegat = 0;
        double menor = 0;
        

        System.out.println("Quantos valores você quer analisar? (de 1 a 10)");
        z = x.nextInt();

        for (int i = 0; i < z; i++) {
            System.out.println("Digite o valor " + (i+1) + ": ");
            double valor = x.nextDouble();
            
            if (valor > 0) {
                numPosit = numPosit + 1;
            }
            if (valor < 0) {
                numNegat = numNegat + 1;
            }
            if (i == 0 || valor < menor) {
                menor = valor;
            }
        }

        System.out.println("Positivos: " + numPosit);
        System.out.println("Negativos: " + numNegat);
        System.out.println("Menor valor: " + menor);
    }   
}