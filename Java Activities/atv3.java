import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        
        double preçoProduto, desconto, novoPreço;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        preçoProduto = entrada.nextDouble();
        
        desconto = preçoProduto * 0.1;
        novoPreço = preçoProduto - desconto;

        System.out.println("Devido ao desconto de 10% atribuído pela loja, seu produto irá custar cerca de: " + "R$" + novoPreço);

        entrada.close();
    }    
}
