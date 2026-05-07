import java.util.*;

class Compra {
    private String nomeComprador;
    private String nomeProduto;
    private double valorProduto;

    public Compra(String nomeComprador, String nomeProduto, double valorProduto) {
        this.nomeComprador = nomeComprador;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    public String toString() {
        return "Comprador: " + nomeComprador + ", Produto: " + nomeProduto + ", Valor: " + valorProduto;
    }
}

public class SistemaCompras {
    static Stack<Compra> pilha = new Stack<>();
    static Queue<Compra> fila = new LinkedList<>();

    public static void guardar(Compra c) {
        pilha.push(c);
    }

    public static void cancelar() {
        if (!pilha.isEmpty()) {
            System.out.println("Cancelada: " + pilha.pop());
        }
    }

    public static void transferir() {
        Stack<Compra> aux = new Stack<>();
        while (!pilha.isEmpty()) {
            aux.push(pilha.pop());
        }
        while (!aux.isEmpty()) {
            fila.add(aux.pop());
        }
    }

    public static void atender() {
        if (!fila.isEmpty()) {
            System.out.println("Atendida: " + fila.poll());
        }
    }

    public static void main(String[] args) {
        guardar(new Compra("Eduardo", "Notebook", 3500));
        guardar(new Compra("Maria", "Mouse", 50));
        guardar(new Compra("Joao", "Teclado", 120));

        cancelar();

        transferir();

        atender();
        atender();
    }
}