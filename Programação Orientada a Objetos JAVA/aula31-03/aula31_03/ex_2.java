package aula31_03;
import java.util.Scanner;
public class ex_2 {
	public static void main (String[] args) {
		Scanner x = new Scanner(System.in);
		ex_2postoServiços s = new ex_2postoServiços();
		ex2Pagamento_ p = new ex2Pagamento_ ();
		ex2_Cliente c = new ex2_Cliente();
		
		System.out.println("Um cliente CHEGOU!");
		System.out.println("Estas são as informações do cliente: ");
		System.out.println("===================================");
		
		c.nome = "Eduardo";
		c.cpf = "54353453417";
		c.telefone = "98754238291";
		c.endereco = "Baunerário Camboriú";
		
		c.cliente();
		
		System.out.println("===================================");
		System.out.println("SERVIÇOS");
		System.out.println("===================================");
		
		s.combustível = "Combustível";
		s.serviços();
		
		System.out.println("FORMA DE PAGAMENTO");
		System.out.println("===================================");
		
		p.p = "Pix";
		p.pagamentos();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
