public class CD extends Item {
    
    private String artista;
    private int quantidadeFaixas;

    public CD(String titulo, int ano, int duracao, String comentarios, String artista, int quantidadeFaixas) {
        super(titulo, ano, duracao, comentarios);
        this.artista = artista;
        this.quantidadeFaixas = quantidadeFaixas;
    }

    public String getArtista() {
        return artista;
    }

    public int getQuantidadeFaixas() {
        return quantidadeFaixas;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("CD:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano: " + getAno());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("Comentários: " + getComentarios());
        System.out.println("Artista: " + artista);
        System.out.println("Quantidade de Faixas: " + quantidadeFaixas);
    }
}
