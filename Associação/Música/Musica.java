public class Musica 
{
    private String nome;
    private int ano;
    private String tipo;
    private Compositor compositor;

    public Musica(String nome, int ano, String tipo, Compositor compositor) 
    {
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
        this.compositor = compositor;
    }

    @Override
    public String toString() 
    {
        return "Música: " + nome + ", Ano: " + ano + ", Tipo: " + tipo + ", Compositor: " + compositor.getNome();
    }
}

class Compositor 
{
    private String nome;
    private String nacionalidade;

    public Compositor(String nome, String nacionalidade) 
    {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() 
    {
        return nome;
    }

    @Override
    public String toString() 
    {
        return "Compositor: " + nome + ", Nacionalidade: " + nacionalidade;
    }
}
