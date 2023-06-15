// Classe abstrata Loja
public abstract class Loja 
{
    private int identificador;
    private String cnpj;
    private String razaoSocial;
    private boolean aberta;

    public Loja(int identificador, String cnpj, String razaoSocial) 
    {
        this.identificador = identificador;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }

    public int getIdentificador() 
    {
        return identificador;
    }

    public void setIdentificador(int identificador) 
    {
        this.identificador = identificador;
    }

    public String getRazaoSocial() 
    {
        return razaoSocial;
    }

    public String getCnpj() 
    {
        return cnpj;
    }

    public boolean isAberta() 
    {
        return aberta;
    }

    public abstract void mostrarLoja();

    public void registraAberturaDia() 
    {
        if (!aberta) 
        {
            aberta = true;
            System.out.println("Loja aberta!");
        } 
        else 
            System.out.println("A loja já está aberta!");
    }

    public void registraFechamentoDia() {
        if (aberta) 
        {
            aberta = false;
            System.out.println("Loja fechada!");
        } 
        else 
            System.out.println("A loja já está fechada!");
    }
}

// Classe concreta LojaConcreta
class LojaConcreta extends Loja 
{
    private String endereco;
    private String gerente;

    public LojaConcreta(int identificador, String cnpj, String razaoSocial, String endereco, String gerente) {
        super(identificador, cnpj, razaoSocial);
        this.endereco = endereco;
        this.gerente = gerente;
    }

    @Override
    public void mostrarLoja() 
    {
        System.out.println("Identificador: " + getIdentificador());
        System.out.println("Razão Social: " + getRazaoSocial());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Endereço: " + endereco);
        System.out.println("Gerente: " + gerente);
        System.out.println("Status: " + (isAberta() ? "Aberta" : "Fechada"));
    }
}

// Interface Registro
interface Registro 
{
    void registraAberturaDia();
    void registraFechamentoDia();
}


class Main 
{
    public static void main(String[] args) 
    {
        //Criação das lojas 
        LojaConcreta matriz = new LojaConcreta(1, "123456789", "Loja Matriz", "Rua Principal, 123", "João");
        LojaConcreta filial1 = new LojaConcreta(2, "987654321", "Loja Filial 1", "Avenida Secundária, 456", "Maria");
        LojaConcreta filial2 = new LojaConcreta(3, "456789123", "Loja Filial 2", "Praça Central, 789", "José");

        // Mostrar as lojas criadas
        matriz.mostrarLoja();
        filial1.mostrarLoja();
        filial2.mostrarLoja();

        // Abrir a matriz e a filial 1
        matriz.registraAberturaDia();
        filial1.registraAberturaDia();

        // Mostrar os dados das lojas após a abertura
        matriz.mostrarLoja();
        filial1.mostrarLoja();

        // Tentar abrir novamente a matriz (já está aberta)
        matriz.registraAberturaDia();

        // Fechar a matriz e a filial 2
        matriz.registraFechamentoDia();
        filial2.registraFechamentoDia();

        // Mostrar os dados das lojas após o fechamento
        matriz.mostrarLoja();
        filial2.mostrarLoja();
    }
}
