import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos cursos serão armazenados: ");
        int numeroDeCursos = sc.nextInt();
        sc.nextLine();

        Cursos[] cursos = new Cursos[numeroDeCursos];

        for (int i = 0; i < numeroDeCursos; i++) {
            System.out.println("Digite os dados do " + (i + 1) + "º curso:");

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Área: ");
            String area = sc.nextLine();

            System.out.println("Duração: ");
            int duracao = sc.nextInt();
            sc.nextLine();

            System.out.println("Quantos alunos: ");
            int numeroDeAlunos = sc.nextInt();
            sc.nextLine();

            cursos[i] = new Cursos(nome, area, duracao, numeroDeAlunos);
        }
        
        sc.close();

        System.out.println("Dados dos cursos: ");

        for (Cursos curso : cursos) {
            System.out.println("Nome: " + curso.getNome());//As chamadas dos encapsulamentos
            System.out.println("Área: " + curso.getArea());
            System.out.println("Duração: " + curso.getDuracao() + " anos");
            System.out.println("Número de alunos: " + curso.getNumerodeAlunos() + " alunos.");
            System.out.println();
        }
    }
}