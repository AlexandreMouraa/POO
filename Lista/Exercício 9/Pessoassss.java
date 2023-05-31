import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoassss {
    private String nome;
    private String sobrenome;
    private String nomeIntermediario;

    public Pessoassss(String nome, String sobrenome, String nomeIntermediario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeIntermediario = nomeIntermediario;
    }

    public String getNomeFormatado() {
        String primeiraLetraNome = nome.substring(0, 1).toUpperCase();
        String primeiraLetraNomeIntermediario = nomeIntermediario.substring(0, 1).toUpperCase();

        return sobrenome.toUpperCase() + ", " + primeiraLetraNome + ". " + primeiraLetraNomeIntermediario + ".";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite o nome intermediário: ");
        String nomeIntermediario = scanner.nextLine();

        Pessoassss pessoa = new Pessoassss(nome, sobrenome, nomeIntermediario);

        System.out.println("Nome formatado: " + pessoa.getNomeFormatado());

        scanner.close();
    }
}

class Livro {
    private String titulo;
    private int codigo;
    private Pessoassss autor;
    private String editora;
    private int edicao;
    private int ano;
    private String local;
    private String genero;

    private static int totalLivrosCriados = 0;
    private static int[] totalLivrosPorGenero = new int[5];

    public Livro(String titulo, int codigo, Pessoassss autor, String editora, int edicao, int ano, String local, String genero) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.ano = ano;
        this.local = local;
        this.genero = genero;

        totalLivrosCriados++;
        atualizarTotalLivrosPorGenero(genero);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Pessoassss getAutor() {
        return autor;
    }

    public void setAutor(Pessoassss autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public static int getTotalLivrosCriados() {
        return totalLivrosCriados;
    }

    public static int getTotalLivrosPorGenero(String genero) {
        int index = getIndexGenero(genero);
        if (index != -1) {
            return totalLivrosPorGenero[index];
        }
        return 0;
    }

    private static void atualizarTotalLivrosPorGenero(String genero) {
        int index = getIndexGenero(genero);
        if (index != -1) {
            totalLivrosPorGenero[index]++;
        }
    }

    private static int getIndexGenero(String genero) {
        for (int i = 0; i < totalLivrosPorGenero.length; i++) {
            if (totalLivrosPorGenero[i] == 0) {
                totalLivrosPorGenero[i] = genero;
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o código do livro (0 para sair): ");
            int codigo = scanner.nextInt();

            if (codigo == 0) {
                break;
            }

            scanner.nextLine(); // Limpar o buffer

            System.out.print("Digite o título do livro: ");
            String titulo = scanner.nextLine();

            System.out.print("Digite o gênero do livro: ");
            String genero = scanner.nextLine();

            System.out.print("Digite o nome do autor: ");
            String nomeAutor = scanner.nextLine();

            System.out.print("Digite o sobrenome do autor: ");
            String sobrenomeAutor = scanner.nextLine();

            System.out.print("Digite o nome intermediário do autor: ");
            String nomeIntermediarioAutor = scanner.nextLine();

            System.out.print("Digite a editora do livro: ");
            String editora = scanner.nextLine();

            System.out.print("Digite a edição do livro: ");
            int edicao = scanner.nextInt();

            System.out.print("Digite o ano do livro: ");
            int ano = scanner.nextInt();

            scanner.nextLine(); // Limpar o buffer

            System.out.print("Digite o local do livro: ");
            String local = scanner.nextLine();

            Pessoassss autor = new Pessoassss(nomeAutor, sobrenomeAutor, nomeIntermediarioAutor);

            Livro livro = new Livro(titulo, codigo, autor, editora, edicao, ano, local, genero);
            livros.add(livro);
        }

        for (Livro livro : livros) {
            System.out.println("Código: " + livro.getCodigo());
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Gênero: " + livro.getGenero());
            System.out.println("Referência: " + livro.getAutor().getNomeFormatado() + ". " +
                    livro.getTitulo() + ". " + livro.getEdicao() + "ª edição. " +
                    livro.getLocal() + ": " + livro.getEditora() + ", " + livro.getAno() + ".");
            System.out.println();
        }

        System.out.println("Total de livros criados: " + Livro.getTotalLivrosCriados());
        System.out.println("Total por gênero:");
        for (int i = 0; i < totalLivrosPorGenero.length; i++) {
            if (totalLivrosPorGenero[i] != 0) {
                System.out.println(totalLivrosPorGenero[i] + " livro(s) do gênero " + totalLivrosPorGenero[i]);
            }
        }

        scanner.close();
    }
}
