public abstract class Item {
    private String titulo;
    private int ano;
    private int duracao;
    private String comentarios;

    public Item(String titulo, int ano, int duracao, String comentarios) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracao = duracao;
        this.comentarios = comentarios;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getComentarios() {
        return comentarios;
    }

    public abstract void mostrarDetalhes();
}