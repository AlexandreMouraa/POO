//Singleton

public class BancoDados
{
    private String nome;
    private int codigo;
    private static BancoDados instancia;


    private BancoDados()
    {
        codigo = 001;
        nome = "MySql";
    }

    public static BancoDados getInstancia()
    {
        if(instancia == null)
        instancia = new BancoDados();

        return instancia;
    }

    public String toString()
    {
        return "BancoDados : " + codigo + "-" + nome + " - Instância :" + this.hashCode() ;
    }

}

class TestaSingletonBD
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            BancoDados Banco = BancoDados.getInstancia();
            System.out.println(Banco);
        }
    }
}