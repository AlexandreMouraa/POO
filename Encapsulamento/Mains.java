import javax.swing.JOptionPane;
public class Mains 
{
        public static void main(String [] args)
        {
            Produtoss produto1 = new Produtoss("Jogo Batalha Naval", 10, "jogo", 100);
            Produtoss produto2 = new Produtoss("Jogo Master", 20, "jogo", 150);
            Produtoss produto3 = new Produtoss("Jogo Quebra-Cabeça", 30, "jogo", 50);

            String nomeProduto = JOptionPane.showInputDialog("Informe o nome do produto:");
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
            String tipo = JOptionPane.showInputDialog("Informe o tipo do produto:");
            float valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do produto:"));

            produto1.inserir(nomeProduto, quantidade, tipo, valor);

            int quantidadeVenda = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade a ser vendida:"));
            produto2.vender(quantidadeVenda);
            
            int codigoComparacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto para comparação:"));
            Produtoss produtoComparacao = new Produtoss("Jogo Master", 10, "jogo", 55);
            boolean mesmoTipo = produto1.igual(produtoComparacao);
            JOptionPane.showMessageDialog(null, "Os produtos 1 e o produto de código " + codigoComparacao + " são do mesmo tipo? " + mesmoTipo);

            int quantidadeCompra = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade a ser comprada:"));
            produto3.comprarSemMudarValor(quantidadeCompra);

            int quantidadeCompraNovoValor = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade a ser comprada com novo valor:"));
            float novoValor = Float.parseFloat(JOptionPane.showInputDialog("Informe o novo valor do produto:"));
            produto3.comprarNovoValor(quantidadeCompraNovoValor, novoValor);

            JOptionPane.showMessageDialog(null, produto1.toString());
            JOptionPane.showMessageDialog(null, produto2.toString());
            JOptionPane.showMessageDialog(null, produto3.toString());
        } 
}