public class MainAluno 
{
    public static void main(String[] args) 
    {
        // Criando os departamentos
        Departamento dep1 = new Departamento("Departamento de Ciências da Computação", "DCC");
        Departamento dep2 = new Departamento("Departamento de Engenharia Elétrica", "DEE");

        // Criando os cursos
        Curso curso1 = new Curso("Ciência da Computação", "CC", dep1);
        Curso curso2 = new Curso("Engenharia Elétrica", "EE", dep2);

        // Criando os alunos
        Aluno aluno1 = new Aluno("João", 001, 2020, curso1);
        Aluno aluno2 = new Aluno("Maria", 002, 2020, curso2);

        // Mostrando as instâncias
        System.out.println(dep1);
        System.out.println(dep2);
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(aluno1);
        System.out.println(aluno2);
    }
    
}
