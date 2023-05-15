public class Aluno 
{
    private String nome;
    private int matricula;
    private int ano;
    private Curso curso;

    public Aluno(String nome, int matricula, int ano, Curso curso) 
    {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    public String toString() 
    {
        return "Nome: " + nome + "\nMatrícula: " + matricula + "\nAno: " + ano + "\nCurso: " + curso.getNome();
    }
}

class Curso 
{
    private String nome;
    private String sigla;
    private Departamento departamento;

    public Curso(String nome, String sigla, Departamento departamento) 
    {
        this.nome = nome;
        this.sigla = sigla;
        this.departamento = departamento;
    }

    public String getNome() 
    {
        return nome;
    }

    public String toString() 
    {
        return "Nome: " + nome + "\nSigla: " + sigla + "\nDepartamento: " + departamento.getNome();
    }
}

class Departamento 
{
    private String nome;
    private String sigla;

    public Departamento(String nome, String sigla) 
    {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() 
    {
        return nome;
    }

    public String toString() 
    {
        return "Nome: " + nome + "\nSigla: " + sigla;
    }
}