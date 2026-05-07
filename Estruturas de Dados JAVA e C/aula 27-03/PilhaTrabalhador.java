import java.util.*;

class Trabalhador {
    String nome;
    int idade;

    public Trabalhador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return nome + " - " + idade;
    }
}

class Node {
    Trabalhador valor;
    Node prox;

    public Node(Trabalhador valor) {
        this.valor = valor;
        this.prox = null;
    }
}

public class PilhaTrabalhador {
    Node topo = null;

    public void push(Trabalhador t) {
        Node novo = new Node(t);
        novo.prox = topo;
        topo = novo;
    }

    public Trabalhador pop() {
        if (topo == null) return null;
        Trabalhador valor = topo.valor;
        topo = topo.prox;
        return valor;
    }

    public void listar() {
        Node atual = topo;
        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.prox;
        }
    }

    public Trabalhador[] toArray() {
        ArrayList<Trabalhador> lista = new ArrayList<>();
        Node atual = topo;
        while (atual != null) {
            lista.add(atual.valor);
            atual = atual.prox;
        }
        return lista.toArray(new Trabalhador[0]);
    }

    public static void bubbleSort(Trabalhador[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].nome.compareTo(arr[j+1].nome) > 0) {
                    Trabalhador temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        PilhaTrabalhador p = new PilhaTrabalhador();

        p.push(new Trabalhador("Carlos", 30));
        p.push(new Trabalhador("Ana", 25));
        p.push(new Trabalhador("Bruno", 28));

        p.listar();

        System.out.println("Removido: " + p.pop());

        Trabalhador[] vetor = p.toArray();

        bubbleSort(vetor);

        for (Trabalhador t : vetor) {
            System.out.println(t);
        }
    }
}