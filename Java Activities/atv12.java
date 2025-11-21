// Algoritmo para pesquisa de habitantes
// 1. Para 6 pessoas:
//    - Ler idade (se negativa, parar)
//    - Ler sexo e salário
//    - Somar idade para média geral
//    - Se masculino: somar salário e contar para média homens
//    - Se feminino E salário < 600: contar mulheres salário baixo
// 2. Calcular média idade: soma idades / 6
// 3. Calcular média salário homens: soma salários / quantidade homens
// 4. Exibir média idade, média salário homens e quantidade mulheres salário baixo



import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        int idade;
        String sexo;
        double salario;
        int somaIdade = 0;
        double somaSalarioHomens = 0;
        int countHomens = 0;
        int mulheresSalarioBaixo = 0;
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite a idade da pessoa " + (i+1) + ": ");
            idade = x.nextInt();
            
            if (idade < 0) {
                break;
            }
            
            System.out.println("Digite o sexo (M/F): ");
            sexo = x.next();
            System.out.println("Digite o salário: ");
            salario = x.nextDouble();
            
            somaIdade += idade;
            
            if (sexo.equalsIgnoreCase("M")) {
                somaSalarioHomens += salario;
                countHomens++;
            }
            
            if (sexo.equalsIgnoreCase("F") && salario < 600.0) {
                mulheresSalarioBaixo++;
            }
        }
        
        double mediaIdade = (double) somaIdade / 6;
        System.out.println("Média de idade do grupo: " + String.format("%.2f", mediaIdade));
        
        if (countHomens > 0) {
            double mediaSalarioHomens = somaSalarioHomens / countHomens;
            System.out.println("Média de salário dos homens: " + String.format("%.2f", mediaSalarioHomens));
        } else {
            System.out.println("Nenhum homem foi cadastrado.");
        }
        
        System.out.println("Quantidade de mulheres com salário abaixo de R$600,00: " + mulheresSalarioBaixo);
    }
}