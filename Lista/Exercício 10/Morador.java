import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Morador {
    private String nome;
    private String cpf;
    private String celular;
    private String dataNascimento;
    private String sexo;
    private String bloco;
    private String apartamento;
    private int codigoAcesso;
    private static int codigoSequencial = 1;

    public Morador(String nome, String cpf, String celular, String dataNascimento, String sexo,
                   String bloco, String apartamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.bloco = bloco;
        this.apartamento = apartamento;
        this.codigoAcesso = codigoSequencial++;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCelular() {
        return celular;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getBloco() {
        return bloco;
    }

    public String getApartamento() {
        return apartamento;
    }

    public int getCodigoAcesso() {
        return codigoAcesso;
    }

    public static int getCodigoSequencial() {
        return codigoSequencial;
    }
}

class CadastroMoradores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite o nome do morador: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o CPF do morador: ");
            String cpf = scanner.nextLine();

            System.out.print("Digite o celular do morador: ");
            String celular = scanner.nextLine();

            System.out.print("Digite a data de nascimento do morador: ");
            String dataNascimento = scanner.nextLine();

            System.out.print("Digite o sexo do morador: ");
            String sexo = scanner.nextLine();

            System.out.print("Digite o bloco do morador: ");
            String bloco = scanner.nextLine();

            System.out.print("Digite o apartamento do morador: ");
            String apartamento = scanner.nextLine();

            Morador morador = new Morador(nome, cpf, celular, dataNascimento, sexo, bloco, apartamento);
            System.out.println("Morador cadastrado: " + morador.getNome());
            System.out.println("Código de acesso: " + morador.getCodigoAcesso());

            System.out.print("Deseja cadastrar mais um morador? (S/N): ");
            resposta = scanner.nextLine();
        } while (resposta.equalsIgnoreCase("S"));

        scanner.close();
    }
}

class CadastroMoradoresLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Morador> moradores = new ArrayList<>();
        String resposta;

        do {
            System.out.print("Digite o nome do morador: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o CPF do morador: ");
            String cpf = scanner.nextLine();

            System.out.print("Digite o celular do morador: ");
            String celular = scanner.nextLine();

            System.out.print("Digite a data de nascimento do morador: ");
            String dataNascimento = scanner.nextLine();

            System.out.print("Digite o sexo do morador: ");
            String sexo = scanner.nextLine();

            System.out.print("Digite o bloco do morador: ");
            String bloco = scanner.nextLine();

            System.out.print("Digite o apartamento do morador: ");
            String apartamento = scanner.nextLine();

            Morador morador = new Morador(nome, cpf, celular, dataNascimento, sexo, bloco, apartamento);
            moradores.add(morador);
            
            System.out.print("Deseja cadastrar mais um morador? (S/N): ");
            resposta = scanner.nextLine();
        } while (resposta.equalsIgnoreCase("S"));

        System.out.println("Dados dos moradores cadastrados:");
        for (Morador morador : moradores) {
            System.out.println("Nome: " + morador.getNome());
            System.out.println("CPF: " + morador.getCpf());
            System.out.println("Celular: " + morador.getCelular());
            System.out.println("Data de Nascimento: " + morador.getDataNascimento());
            System.out.println("Sexo: " + morador.getSexo());
            System.out.println("Bloco: " + morador.getBloco());
            System.out.println("Apartamento: " + morador.getApartamento());
            System.out.println("Código de Acesso: " + morador.getCodigoAcesso());
            System.out.println("-----------------------------------");
        }

        System.out.println("Total de moradores cadastrados: " + moradores.size());

        scanner.close();
    }
}
