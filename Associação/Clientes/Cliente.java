public class Cliente 
{
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Cliente(String nome, String cpf, Endereco endereco) 
    {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() 
    {
        return nome;
    }

    public String getCpf() 
    {
        return cpf;
    }

    public Endereco getEndereco() 
    {
        return endereco;
    }

    @Override
    public String toString() 
    {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}

class Endereco 
{
    private String rua;
    private int numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String complemento, String cep, String bairro, String cidade, String estado) 
    {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() 
    {
        return rua;
    }

    public int getNumero() 
    {
        return numero;
    }

    public String getComplemento() 
    {
        return complemento;
    }

    public String getCep() 
    {
        return cep;
    }

    public String getBairro() 
    {
        return bairro;
    }

    public String getCidade() 
    {
        return cidade;
    }

    public String getEstado() 
    {
        return estado;
    }

    @Override
    public String toString() 
    {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}