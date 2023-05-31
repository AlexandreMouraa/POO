public class Jogoss extends Item {
    private int numeroJogadores;
    private String plataforma;

    public Jogoss(String titulo, int ano, int duracao, String comentarios, int numeroJogadores, String plataforma) {
        super(titulo, ano, duracao, comentarios);
        this.numeroJogadores = numeroJogadores;
        this.plataforma = plataforma;
    }

    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Jogo:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano: " + getAno());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("Comentários: " + getComentarios());
        System.out.println("Número de Jogadores: " + numeroJogadores);
        System.out.println("Plataforma: " + plataforma);
    }
}