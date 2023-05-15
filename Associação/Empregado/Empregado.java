public class Empregado 
{
    private String nome;
    private int matricula;
    private Empresa empresa;

    public Empregado(String nome, int matricula, Empresa empresa) 
    {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
    }

    @Override
    public String toString() 
    {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", empresa=" + empresa +
                '}';
    }
}

class Empresa 
{
    private String cnpj;
    private String razaoSocial;
    private Endereco endereco;

    public Empresa(String cnpj, String razaoSocial, Endereco endereco) 
    {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
    }

    @Override
    public String toString() 
    {
        return "Empresa{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
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