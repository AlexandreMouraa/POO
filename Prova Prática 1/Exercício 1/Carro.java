public class Carro extends Veiculo
{
    private String acessorios;
    public Carro(String marca, String modelo, double preco, String acessorios)
    {
        super(marca, modelo, preco);
        this.acessorios = acessorios;
    }
}
