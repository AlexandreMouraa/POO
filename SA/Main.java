import javax.swing.JOptionPane;
public class Main {

    public static void main(String [] args)
    {
   
        //Verificação de entrada de código
        /*while(!Produtos.verificacaodocodigo(codigo))
        {
            System.out.println("Insira um código válido: ");
            codigo = sc.nextInt();

            if(!Produtos.verificacaodocodigo(codigo))
            {
                System.out.println("Código Inválido. Insira um valor positivo");;
            }
        }*/

        Produtos produto1 = new Produtos(1, "Jogo Batalha Naval", 10, "jogo", 100);
        Produtos produto2 = new Produtos(2, "Jogo Master", 20, "jogo", 150);
        Produtos produto3 = new Produtos(3, "Jogo Quebra-Cabeça", 30, "jogo", 50);

        String nomeProduto = JOptionPane.showInputDialog("Informe o nome do produto:");
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
        String tipo = JOptionPane.showInputDialog("Informe o tipo do produto:");
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do produto:"));

        produto1.inserir(nomeProduto, quantidade, tipo, valor);

        int quantidadeVenda = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade a ser vendida:"));
        produto2.vender(quantidadeVenda);
        
        int codigoComparacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto para comparação:"));
        Produtos produtoComparacao = new Produtos(codigoComparacao, "", 0, "", 0);
        boolean mesmoTipo = produto1.igual(produtoComparacao);
        JOptionPane.showMessageDialog(null, "Os produtos 1 e o produto de código " + codigoComparacao + " são do mesmo tipo? " + mesmoTipo);

        int quantidadeCompra = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade a ser comprada:"));
        produto3.comprarSemmudarValor(quantidadeCompra);

        int quantidadeCompraNovoValor = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade a ser comprada com novo valor:"));
        float novoValor = Float.parseFloat(JOptionPane.showInputDialog("Informe o novo valor do produto:"));
        produto3.comprarNovoValor(quantidadeCompraNovoValor, novoValor);

        JOptionPane.showMessageDialog(null, produto1.toString());
        JOptionPane.showMessageDialog(null, produto2.toString());
        JOptionPane.showMessageDialog(null, produto3.toString());

    }
    
}
