import java.util.Scanner;

public class atv1 {
    
    public static void main(String[] args) {
        
        double quilometro, quantidadeLitro, consumoMedio;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a distância percorrida (em Quilômetros): ");
        quilometro = entrada.nextDouble();
        System.out.println("Digite a quantidade de litros de combustível gasto: ");
        quantidadeLitro = entrada.nextDouble();
        consumoMedio = quilometro / quantidadeLitro;
        System.out.println("O consumo médio do veículo foi de " + consumoMedio + "km/L");

        entrada.close();
    }
}
