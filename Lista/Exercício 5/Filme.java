public class Filme {
    private int codigo;
    private String nome;
    private String genero;
    private int ano;
    private String autorPrincipal;
    private static int totalFilmes = 0;

    public Filme(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        totalFilmes++;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    public static int getTotalFilmes() {
        return totalFilmes;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", ano=" + ano +
                ", autorPrincipal='" + autorPrincipal + '\'' +
                '}';
    }
}
