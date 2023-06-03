public class Produtos
{
    int Codigo;
    String nome;
    int quantidade;
    String tipo;
    float valor;

    Produtos(int Codigo, String nome, int quantidade, String tipo, float valor)
    {
        this.Codigo = Codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    void comprarNovoValor(int QuantidadeComprada, float AtualizadoValor)
    {
        quantidade += QuantidadeComprada;
        valor = AtualizadoValor;
        System.out.println("Compra Realizada!");
    }

    public void comprarSemmudarValor(int quantidadeComprada) 
    {
        quantidade += quantidadeComprada;
        System.out.println("Compra realizada!");
    }

    public void inserir(String nome, int quantidade, String tipo, float valor) 
    {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
        System.out.println("Dados do produto atualizados.");
    }

    public boolean igual(Produtos produto) 
    {
        return this.nome.equals(produto.nome) && this.tipo.equals(produto.tipo);
    }

    /*public static boolean verificacaodocodigo(int codigo)
    {
        return codigo > 0;
    }*/

    public String toString() 
    {
        return "Código: " + Codigo + "\n" +
                "Nome: " + nome + "\n" +
                "Quantidade em estoque: " + quantidade + "\n" +
                "Tipo: " + tipo + "\n" +
                "Valor: R$" + valor;
    }

    public void vender(int quantidadeVendida) 
    {
        if (quantidade >= quantidadeVendida) 
        {
            quantidade -= quantidadeVendida;
            float valorTotal = valor * quantidadeVendida;
            System.out.println("Venda realizada! Valor total: R$" + valorTotal);
        } 
        else 
        {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }
}