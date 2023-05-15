public class Cursos 
{
    private String nome;
    private String area;
    private int duracao;
    private int numerodeAlunos;

    public Cursos(String nome, String area, int duracao, int numerodeAlunos) 
    {
        this.nome = nome;
        this.area = area;
        this.duracao = duracao;
        this.numerodeAlunos = numerodeAlunos;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getArea() 
    {
        return area;
    }

    public void setArea(String area) 
    {
        this.area = area;
    }

    public int getDuracao() 
    {
        return duracao;
    }

    public void setDuracao(int duracao) 
    {
        this.duracao = duracao;
    }

    public int getNumerodeAlunos() 
    {
        return numerodeAlunos;
    }

    public void setNumerodeAlunos(int numerodeAlunos) 
    {
        this.numerodeAlunos = numerodeAlunos;
    }
}