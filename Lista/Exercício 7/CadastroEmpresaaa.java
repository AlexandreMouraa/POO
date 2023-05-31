import java.util.ArrayList;
import java.util.List;

//Resolvi nao copiar dos slides e fazer de uma forma um pouco diferente...

class Funcionario {
    private String nome;
    private double salario;
    private String cpf;

    public Funcionario(String nome, double salario, String cpf) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }

    public double calcularProventosAnuais() {
        return salario * 12;
    }
}

class Gerente extends Funcionario {
    private String areaResponsavel;

    public Gerente(String nome, double salario, String cpf, String areaResponsavel) {
        super(nome, salario, cpf);
        this.areaResponsavel = areaResponsavel;
    }

    public String getAreaResponsavel() {
        return areaResponsavel;
    }
}

class Vendedor extends Funcionario {
    private double[] vendasMensais;
    private double percentualComissao;

    public Vendedor(String nome, double salario, String cpf, double[] vendasMensais, double percentualComissao) {
        super(nome, salario, cpf);
        this.vendasMensais = vendasMensais;
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    @Override
    public double calcularProventosAnuais() {
        double totalVendas = 0;
        for (double venda : vendasMensais) {
            totalVendas += venda;
        }
        return (getSalario() + totalVendas * percentualComissao / 100) * 12;
    }
}

class Empresa {
    private String cnpj;
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}

public class CadastroEmpresaaa {
    public static void main(String[] args) {
        // Criando os funcionários
        Funcionario f1 = new Funcionario("Funcionário 1", 2000, "111.111.111-11");
        Funcionario f2 = new Funcionario("Funcionário 2", 2500, "222.222.222-22");
        Funcionario f3 = new Funcionario("Funcionário 3", 3000, "333.333.333-33");
        Funcionario f4 = new Funcionario("Funcionário 4", 3500, "444.444.444-44");
        Funcionario f5 = new Funcionario("Funcionário 5", 4000, "555.555.555-55");

        // Criando os gerentes
        Gerente g1 = new Gerente("Gerente 1", 5000, "666.666.666-66", "Área 1");
        Gerente g2 = new Gerente("Gerente 2", 5500, "777.777.777-77", "Área 2");

        // Criando os vendedores
        double[] vendasVendedor1 = {1000, 2000, 1500, 2500, 1800, 3000, 1200, 2800, 2200, 1900, 1700, 2300};
        Vendedor v1 = new Vendedor("Vendedor 1", 2000, "888.888.888-88", vendasVendedor1, 5);

        double[] vendasVendedor2 = {1500, 1800, 1900, 2100, 2200, 2000, 1900, 2500, 2700, 2300, 2400, 2200};
        Vendedor v2 = new Vendedor("Vendedor 2", 2200, "999.999.999-99", vendasVendedor2, 3);

        // Criando a empresa
        Empresa empresa = new Empresa("123456789", "Minha Empresa");

        // Adicionando os funcionários à empresa
        empresa.adicionarFuncionario(f1);
        empresa.adicionarFuncionario(f2);
        empresa.adicionarFuncionario(f3);
        empresa.adicionarFuncionario(f4);
        empresa.adicionarFuncionario(f5);
        empresa.adicionarFuncionario(g1);
        empresa.adicionarFuncionario(g2);
        empresa.adicionarFuncionario(v1);
        empresa.adicionarFuncionario(v2);

        // Mostrando os dados dos funcionários e seus proventos anuais
        List<Funcionario> funcionarios = empresa.getFuncionarios();
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Proventos Anuais: " + funcionario.calcularProventosAnuais());
            System.out.println("-----------------------------------");
        }

        // Aplicando aumento de 10% para todos os funcionários
        for (Funcionario funcionario : funcionarios) {
            funcionario.aumentarSalario(10);
        }

        System.out.println("Após aumento de 10%:");

        // Mostrando os dados dos funcionários e seus proventos anuais após o aumento
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Proventos Anuais: " + funcionario.calcularProventosAnuais());
            System.out.println("-----------------------------------");
        }
    }
}
