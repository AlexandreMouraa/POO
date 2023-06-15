// Classe base Funcionario
public class Funcionario 
{
    private String nome;
    private String sobrenome;

    public Funcionario(String nome, String sobrenome) 
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    // Getters e Setters
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getSobrenome() 
    {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) 
    {
        this.sobrenome = sobrenome;
    }

    // Método para mostrar os dados do funcionário
    public void mostrarDados() 
    {
        System.out.println("Nome: " + nome + " " + sobrenome);
    }

    // Método para calcular os ganhos mensais do funcionário
    public double calcularGanhosMensais() 
    {
        return 0; // Valor padrão para a classe base, pois cada tipo de funcionário tem seu cálculo específico
    }
}

// Classe Gerente, herda de Funcionario
class Gerente extends Funcionario 
{
    private double salarioMensal;
    private double bonificacao;

    public Gerente(String nome, String sobrenome, double salarioMensal, double bonificacao) 
    {
        super(nome, sobrenome);
        this.salarioMensal = salarioMensal;
        this.bonificacao = bonificacao;
    }

    // Getters e Setters
    public double getSalarioMensal() 
    {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) 
    {
        this.salarioMensal = salarioMensal;
    }

    public double getBonificacao() 
    {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) 
    {
        this.bonificacao = bonificacao;
    }

    // Sobrescrita do método mostrarDados para incluir informações específicas do gerente
    @Override
    public void mostrarDados() 
    {
        super.mostrarDados();
        System.out.println("Cargo: Gerente");
    }

    // Cálculo dos ganhos mensais para um gerente
    @Override
    public double calcularGanhosMensais() 
    {
        return salarioMensal + bonificacao;
    }
}

// Classe Administrador, herda de Funcionario
class Administrador extends Funcionario 
{
    private double salarioMensal;

    public Administrador(String nome, String sobrenome, double salarioMensal) 
    {
        super(nome, sobrenome);
        this.salarioMensal = salarioMensal;
    }

    // Getter e Setter
    public double getSalarioMensal() 
    {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) 
    {
        this.salarioMensal = salarioMensal;
    }

    // Sobrescrita do método mostrarDados para incluir informações específicas do administrador
    @Override
    public void mostrarDados() 
    {
        super.mostrarDados();
        System.out.println("Cargo: Administrador");
    }

    // Cálculo dos ganhos mensais para um administrador
    @Override
    public double calcularGanhosMensais() 
    {
        return salarioMensal;
    }
}

// Classe Comissionado, herda de Funcionario
class Comissionado extends Funcionario 
{
    private double salarioMensal;
    private double totalVendas;
    private double percentualComissao;

    public Comissionado(String nome, String sobrenome, double salarioMensal, double totalVendas, double percentualComissao) 
    {
        super(nome, sobrenome);
        this.salarioMensal = salarioMensal;
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    // Getters e Setters
    public double getSalarioMensal() 
    {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) 
    {
        this.salarioMensal = salarioMensal;
    }

    public double getTotalVendas() 
    {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) 
    {
        this.totalVendas = totalVendas;
    }

    public double getPercentualComissao() 
    {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) 
    {
        this.percentualComissao = percentualComissao;
    }

    // Sobrescrita do método mostrarDados para incluir informações específicas do comissionado
    @Override
    public void mostrarDados() 
    {
        super.mostrarDados();
        System.out.println("Cargo: Comissionado");
    }

    // Cálculo dos ganhos mensais para um comissionado
    @Override
    public double calcularGanhosMensais() 
    {
        return salarioMensal + (totalVendas * percentualComissao);
    }
}

// Classe Horista, herda de Funcionario
class Horista extends Funcionario 
{
    private int quantidadeHorasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String sobrenome, int quantidadeHorasTrabalhadas, double valorHora) 
    {
        super(nome, sobrenome);
        this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
        this.valorHora = valorHora;
    }

    // Getters e Setters
    public int getQuantidadeHorasTrabalhadas() 
    {
        return quantidadeHorasTrabalhadas;
    }

    public void setQuantidadeHorasTrabalhadas(int quantidadeHorasTrabalhadas) 
    {
        this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
    }

    public double getValorHora() 
    {
        return valorHora;
    }

    public void setValorHora(double valorHora) 
    {
        this.valorHora = valorHora;
    }

    // Sobrescrita do método mostrarDados para incluir informações específicas do horista
    @Override
    public void mostrarDados() 
    {
        super.mostrarDados();
        System.out.println("Cargo: Horista");
    }

    // Cálculo dos ganhos mensais para um horista
    @Override
    public double calcularGanhosMensais() 
    {
        return quantidadeHorasTrabalhadas * valorHora;
    }
}


// Classes Administrador, Comissionado e Horista seguem a mesma estrutura, com suas particularidades específicas.

// Classe principal
class Principal 
{
    public static void main(String[] args) 
    {
        // Instanciar os funcionários
        Funcionario[] funcionarios = new Funcionario[10];
        funcionarios[0] = new Horista("João", "Silva", 40, 20);
        funcionarios[1] = new Horista("Maria", "Santos", 35, 18);
        funcionarios[2] = new Administrador("Pedro", "Almeida", 5000);
        funcionarios[3] = new Administrador("Ana", "Souza", 4500);
        funcionarios[4] = new Administrador("Carlos", "Ferreira", 4800);
        funcionarios[5] = new Administrador("Mariana", "Rodrigues", 5200);
        funcionarios[6] = new Comissionado("Lucas", "Oliveira", 4000, 100000, 0.05);
        funcionarios[7] = new Comissionado("Camila", "Gomes", 3500, 80000, 0.04);
        funcionarios[8] = new Comissionado("Rafael", "Pereira", 3800, 120000, 0.06);
        funcionarios[9] = new Gerente("Fernanda", "Lima", 8000, 2000);

        // Mostrar os dados e ganhos mensais de cada funcionário
        for (Funcionario funcionario : funcionarios) 
        {
            funcionario.mostrarDados();
            double ganhosMensais = funcionario.calcularGanhosMensais();
            System.out.println("Ganhos Mensais: " + ganhosMensais);
            System.out.println();
        }
    }
}
