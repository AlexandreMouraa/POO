public class Moto extends Veiculo
{
    private String tipo;

    public Moto(String marca, String modelo, double preco, String tipo)
    {
        super(marca, modelo, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
