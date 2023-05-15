public class Produtoss 
{

    private static int proximoCodigo = 0;
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private float valor;

    public Produtoss(String nome, int quantidade, String tipo, float valor) 
    {
        this.codigo = proximoCodigo++;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void comprarNovoValor(int quantidadeComprada, float novoValor) 
    {
        quantidade += quantidadeComprada;
        valor = novoValor;
        System.out.println("Compra realizada!");
    }

    public void comprarSemMudarValor(int quantidadeComprada) 
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

    public boolean igual(Produtoss produto) 
    {
        return this.nome.equals(produto.nome) && this.tipo.equals(produto.tipo);
    }

    public String toString() 
    {
        return "Código: " + codigo + "\n" +
                "Nome: " + nome + "\n" +
                "Quantidade em estoque: " + quantidade + "\n" +
                "Tipo: " + tipo + "\n" +
                "Valor: R$" + valor;
    }

    public void vender(int quantidadeVendida) 
    {
        if (quantidade >= quantidadeVendida) {
            quantidade -= quantidadeVendida;
            float valorTotal = valor * quantidadeVendida;
            System.out.println("Venda realizada! Valor total: R$" + valorTotal);
        } else {
            System.out.println("Estoque insuficiente para a venda.");
        }
    }
}