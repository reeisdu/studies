import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        
        double salario, pendenciasQtd;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        salario = entrada.nextDouble();
        System.out.println("Digite a quantidade de suas pendências: ");
        pendenciasQtd = entrada.nextDouble();
        
        
        if (salario > 2500 && pendenciasQtd <= 2) {
            System.out.println("Seu Empréstimo foi Aprovado!");
            
            double valorEmp;
            double numParcela;
            double valorParcela, juros, valorTotal;

            System.out.println("Digite o valor do Empréstimo: ");
            valorEmp = entrada.nextDouble();
            System.out.println("Digite o número de parcelas: ");
            numParcela = entrada.nextDouble();

            juros = valorEmp * 0.9 * numParcela /100;
            valorTotal = valorEmp + juros;
            valorParcela = valorTotal / numParcela;

            System.out.println("O valor de cada parcela ficou " + valorParcela);
            System.out.println("O valor total do financiamento será de " + valorTotal);
            
        } else if (salario < 2500 && pendenciasQtd > 2) {
            System.out.println("Seu Empréstimo Não Foi Aprovado, pois não deve haver mais de duas pendências em seu nome e seu salário deve ser maior que R$ 2500,00.");
        } else if (salario > 2500 && pendenciasQtd > 2) {
            System.out.println("Seu Empréstimo Não Foi Aprovado, pois não deve haver mais de duas pendências em seu nome.");
        } else if (salario < 2500 && pendenciasQtd <= 2) {
            System.out.println("Seu Empréstimo Não Foi Aprovado, pois o salário deve ser maior que R$ 2.500,00.");
        } else if (salario == 2500 && pendenciasQtd <= 2) {
            System.out.println("Seu Empréstimo Não Foi Aprovado, pois o salário deve ser maior que R$ 2.500,00.");
        }
        entrada.close();
    }
}
