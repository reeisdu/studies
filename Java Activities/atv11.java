import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double nota;
        int faltas;
        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;
        double somaNotas = 0;
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a nota do aluno " + (i+1) + ": ");
            nota = x.nextDouble();
            System.out.println("Digite as faltas do aluno " + (i+1) + ": ");
            faltas = x.nextInt();
            
            double frequencia = ((60.0 - faltas) / 60.0) * 100;
            somaNotas += nota;
            
            if (nota >= 6.0 && frequencia >= 75.0) {
                aprovados++;
            } else if (nota >= 3.0 && frequencia >= 75.0) {
                exame++;
            } else {
                reprovados++;
            }
        }
        
        double mediaTurma = somaNotas / 20;
        
        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos de exame: " + exame);
        System.out.println("Alunos reprovados: " + reprovados);
        System.out.println("Média da turma: " + String.format("%.2f", mediaTurma));
    }
}