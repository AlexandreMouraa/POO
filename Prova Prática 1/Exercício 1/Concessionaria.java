import java.util.List;
import java.util.ArrayList;

public class Concessionaria
{
    private String nome;
    List <Veiculo> Veiculos;
    private Endereco endereco;

    public Endereco getEndereco()
    {
        return endereco;
    }

    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }

    public Concessionaria(String nome)
    {
        this.nome = nome;
        this.Veiculos = new ArrayList <>();
    }

    public void AddCarro(Veiculo veiculo)
    {
        Veiculos.add(veiculo);
    }

    public List<Veiculo> getVeiculos() {
        return Veiculos;
    }
}