import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
       
        int numLanche;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("[1] - Hambúrguer (R$ 10,00)");
        System.out.println("[2] Cachorro-Quente (R$ 7,00)");
        System.out.println("[3] Batata Frita (R$ 5,00)");

        System.out.println("Escolha o seu lanche: ");
            numLanche = entrada.nextInt();
            switch (numLanche) {
                case 1:
                    System.out.println("Você escolheu: Hambúrguer");
                    System.out.println("Valor a pagar: R$ 10,00");
                    break;
                
                case 2:
                    System.out.println("Você escolheu: Cachorro-Quente");
                    System.out.println("Valor a pagar: R$ 7,00");
                    break;

                case 3:
                    System.out.println("Você escolheu: Batata Frita");
                    System.out.println("Valor a pagar: R$ 5,00");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
                    
            }
        entrada.close();
    }
}
