public class Filmess extends Item {
    private String diretor;

    public Filmess(String titulo, int ano, int duracao, String comentarios, String diretor) {
        super(titulo, ano, duracao, comentarios);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Filme:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano: " + getAno());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("Comentários: " + getComentarios());
        System.out.println("Diretor: " + diretor);
    }
}