import java.util.Scanner;

public class Ex3_Lab1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos cursos serão armazenados: ");
        int NrdeCursos = sc.nextInt();
        sc.nextLine();

        Curso [] curso = new Curso[NrdeCursos];

        for(int i = 0; i < NrdeCursos; i++)
        {
            System.out.println("Digite os dados do " + (i + 1) + "° curso:");

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Área: ");
            String area = sc.nextLine();

            System.out.println("Duração: ");
            int duracao = sc.nextInt();
            sc.nextLine();//Consumir a quebra de linha deixada pelo nextInt.

            System.out.println("Quantos alunos: ");
            int numerodeAlunos = sc.nextInt();
            sc.nextLine();

            curso[i] = new Curso(nome, area, duracao, numerodeAlunos);
        }

        System.out.println("Dados dos cursos: ");

        for(Curso cursos : curso)
        {
            System.out.println("Nome: " + cursos.nome);
            System.out.println("Área: " + cursos.area);
            System.out.println("Duração: " + cursos.duracao + " anos");
            System.out.println("Número de alunos: " + cursos.numerodeAlunos + " alunos.");
            System.out.println();
        }
    }
}
