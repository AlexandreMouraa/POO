public class Alunos 
{
    private String nome;
    private int matricula;
    private int ano;
    private Cursoss curso;

    public Alunos(String nome, int matricula, int ano, Cursoss curso) 
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

class Cursoss 
{
    private String nome;
    private String sigla;
    private Departamento departamento;

    public Cursoss(String nome, String sigla, Departamento departamento) 
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