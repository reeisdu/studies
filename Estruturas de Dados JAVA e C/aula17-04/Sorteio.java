import java.util.Random;
import java.util.Stack;


public class Sorteio {
    
    Stack<Integer> pilha1;
    Stack<Integer> pilha2;

    public Sorteio() {
        pilha1 = new Stack<>();
        pilha2 = new Stack<>();
    }

    public void gerarNumeros() {
        Random r = new Random();
        
        for (int i = 0; i < 30; i++) {
            int num = r.nextInt(101);
            if (num <= 50) {
                pilha1.push(num);
            } else {
                pilha2.push(num);
            }
        }
    }

    public void removerSimultaneo() {

        while (!pilha1.isEmpty() && !pilha2.isEmpty()) {
            pilha1.pop();
            pilha2.pop();
        }

        if (pilha1.isEmpty() && pilha2.isEmpty()) {
            System.out.println("Sorteio invalido");
        } else if (!pilha1.isEmpty()) {
            while (!pilha1.isEmpty()) {
                System.out.print(pilha1.pop());
            }
        } else {
            while (!pilha2.isEmpty()) {
                System.out.print(pilha2.pop());
            }
        }
    }








}
