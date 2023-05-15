import java.util.Scanner;

public class Ex2_Lab1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        Curso c1 = criarCurso(sc, 1);
        Curso c2 = criarCurso(sc, 2);
        Curso c3 = criarCurso(sc, 3);
        Curso c4 = criarCurso(sc, 4);

        System.out.println("Dados do curso: ");
        Curseexibition(c1);
        Curseexibition(c2);
        Curseexibition(c3);
        Curseexibition(c4);
    }
        public static Curso criarCurso(Scanner sc, int numero)
        {
            System.out.println("Digite os dados do " + numero + "° curso: ");

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

            System.out.println();

            return new Curso(nome, area, duracao, numerodeAlunos);
        }

        public static void Curseexibition(Curso curso)
        {
            System.out.println("Nome: " + curso.nome);
            System.out.println("Área: " + curso.area);
            System.out.println("Duração: " + curso.duracao + " anos");
            System.out.println("Número de alunos: " + curso.numerodeAlunos + " alunos.");
            System.out.println();
        }
}
