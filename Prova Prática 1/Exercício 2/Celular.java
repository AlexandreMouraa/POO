public class Celular
{
    private String marca;
    private String modelo;
    private String cor;

    public Celular(String marca, String modelo)
    {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Celular(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getCor()
    {
        return cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public String toString()
    {
        return marca + " " + modelo;
    }

}