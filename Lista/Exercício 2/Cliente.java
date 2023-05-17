public class Cliente 
{
    private String nome;
    private int idade;
    private String Telefone;


    public Cliente(String nome)
    {
        this.nome = nome;
    }


    public String getNome() 
    {
        return nome;
    }


    public void setNome(String nome) 
    {
        this.nome = nome;
    }


    public int getIdade() 
    {
        return idade;
    }


    public void setIdade(int idade) 
    {
        this.idade = idade;
    }


    public String getTelefone() 
    {
        return Telefone;
    }


    public void setTelefone(String telefone) 
    {
        Telefone = telefone;
    }

    @Override
    public String toString()
    {
        return "Cliente : " + nome + " - Idade : " + idade + " - Telefone : " + Telefone;
    }

}
