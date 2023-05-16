public class Curse 
{

    private String nome;
    private int ano;
    private int duracao;

    Curse(String nome, int ano, int duracao)
    {
        this.nome = nome;
        this.ano = ano;
        this.duracao = duracao;
    }

    public int getAno()
    {
        return ano;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getDuracao()
    {
        return duracao;
    }

    public void setDuracao(int duracao)
    {
        this.duracao = duracao;
    }

    public String toString()
    {
        return "Curso: " + nome + "\nSua duração é de: " + duracao + "\nTeve início no ano de: " + ano;
    }
}
