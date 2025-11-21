import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        double peso, altura;
        double imc;


        System.out.println("Digite seu peso: ");
        peso = x.nextDouble();
        System.out.println("Digite sua altura: ");
        altura = x.nextDouble();

        x.nextLine();
        System.out.println("Digite seu sexo (M/F): ");
        
        String sexo = x.nextLine();
        
        imc = peso / (altura * altura);

        System.out.println("Informações: " + "Seu peso: " + peso + ", " + "Sua altura: " + altura + ", " + "Seu sexo: " + sexo);
        System.out.println("--------------------------");
        if (sexo.equalsIgnoreCase("F")) {
            if (imc < 19.1) {
                System.out.println("Você está abaixo do peso.");
            } else if (imc > 19.1 && imc <= 25.8) {
                System.out.println("Seu IMC é de: " + String.format("%.2f", imc) + " --- " + "Você está dentro da normalidade!");            
            } else if (imc > 25.8 && imc <= 27.3  ) {
                System.out.println("Seu IMC é de: " + String.format("%.2f", imc) + " --- " + "Você está marginalmente acima do peso.");
            } else if (imc > 27.3 && imc <= 32.3) {
                System.out.println("Seu IMC é de: " + String.format("%.2f", imc) + " --- " + "Você está acima do peso ideal.");
            } else if (imc > 32.3) {
                System.out.println("Seu IMC é de: " + String.format("%.2f", imc) + " --- " + "Você é considerada uma pessoa obesa.");
            }            
        }

        if (sexo.equalsIgnoreCase("M")) {
            if (imc < 20.7) {
                System.out.println("Você está abaixo do peso.");
            } else if (imc > 20.7 && imc <= 26.4) {
                System.out.println("Seu IMC é de: " + String.format("%.2f", imc) + " --- " + "Você está dentro da normalidade!");            
            } else if (imc > 26.4 && imc <= 27.8  ) {
                System.out.println("Seu IMC é de: " + String.format("%.2f", imc) + " --- " + "Você está marginalmente acima do peso.");
            } else if (imc > 27.8 && imc <= 31.1) {
                System.out.println("Seu IMC é de: " + String.format("%.2f", imc) + " --- " + "Você está acima do peso ideal.");
            } else if (imc > 31.1) {
                System.out.println("Seu IMC é de: " + String.format("%.2f", imc) + " --- " + "Você é considerada uma pessoa obesa.");
            }  
        }
    }
}
