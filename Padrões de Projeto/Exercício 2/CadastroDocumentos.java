// Classe abstrata Documento
abstract class Documento 
{
    private int numero;
    private String remetente;
    private String tipo;

    public Documento(int numero, String remetente, String tipo) 
    {
        this.numero = numero;
        this.remetente = remetente;
        this.tipo = tipo;
    }

    public int getNumero() 
    {
        return numero;
    }

    public String getRemetente() 
    {
        return remetente;
    }

    public String getTipo() 
    {
        return tipo;
    }

    public abstract void exibirConteudo();
}

// Classe Carta
class Carta extends Documento 
{
    public Carta(int numero, String remetente) 
    {
        super(numero, remetente, "Carta");
    }

    public void exibirConteudo() 
    {
        System.out.println("Conteúdo da carta");
    }
}

// Classe Notificacao
class Notificacao extends Documento 
{
    public Notificacao(int numero, String remetente) 
    {
        super(numero, remetente, "Notificação");
    }

    public void exibirConteudo() 
    {
        System.out.println("Conteúdo da notificação");
    }
}

// Classe Telegrama
class Telegrama extends Documento 
{
    public Telegrama(int numero, String remetente) 
    {
        super(numero, remetente, "Telegrama");
    }

    public void exibirConteudo() 
    {
        System.out.println("Conteúdo do telegrama");
    }
}

// Classe abstrata Fabrica
abstract class Fabrica 
{
    public abstract Documento criarDocumento(int numero, String remetente);
}

// Classe FabricaDocumentos
class FabricaDocumentos extends Fabrica 
{
    public Documento criarDocumento(int numero, String remetente) 
    {
        // Lógica para decidir qual tipo de documento criar
        // Neste exemplo, é criado um documento aleatório entre Carta, Notificação e Telegrama
        int tipoDocumento = (int) (Math.random() * 3);

        switch (tipoDocumento) 
        {
            case 0:
                return new Carta(numero, remetente);
            case 1:
                return new Notificacao(numero, remetente);
            case 2:
                return new Telegrama(numero, remetente);
            default:
                throw new IllegalArgumentException("Tipo de documento inválido");
        }
    }
}

// Classe CadastroDocumentos
public class CadastroDocumentos 
{
    private Fabrica fabrica;

    public CadastroDocumentos(Fabrica fabrica) 
    {
        this.fabrica = fabrica;
    }

    public Documento criarDocumento(int numero, String remetente) 
    {
        return fabrica.criarDocumento(numero, remetente);
    }

    public static void main(String[] args) 
    {
        CadastroDocumentos cadastro = new CadastroDocumentos(new FabricaDocumentos());

        Documento documento1 = cadastro.criarDocumento(1, "Remetente 1");
        documento1.exibirConteudo();

        Documento documento2 = cadastro.criarDocumento(2, "Remetente 2");
        documento2.exibirConteudo();
    }
}
