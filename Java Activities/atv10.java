import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int quantidade;
        double altura;
        String sexo;
        double somaAlturaHomens = 0;
        double somaAlturaMulheres = 0;
        int countHomens = 0;
        int countMulheres = 0;
        
        System.out.println("Quantas pessoas você quer cadastrar? ");
        quantidade = x.nextInt();
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o sexo da pessoa " + (i+1) + " (M/F): ");
            sexo = x.next();
            System.out.println("Digite a altura da pessoa " + (i+1) + ": ");
            altura = x.nextDouble();
            
            if (sexo.equalsIgnoreCase("M")) {
                somaAlturaHomens += altura;
                countHomens++;
            } else if (sexo.equalsIgnoreCase("F")) {
                somaAlturaMulheres += altura;
                countMulheres++;
            }
        }
        
        if (countHomens > 0) {
            double mediaHomens = somaAlturaHomens / countHomens;
            System.out.println("Altura média dos homens: " + String.format("%.2f", mediaHomens));
        } else {
            System.out.println("Nenhum homem foi cadastrado.");
        }
        
        if (countMulheres > 0) {
            double mediaMulheres = somaAlturaMulheres / countMulheres;
            System.out.println("Altura média das mulheres: " + String.format("%.2f", mediaMulheres));
        } else {
            System.out.println("Nenhuma mulher foi cadastrada.");
        }
    }
}