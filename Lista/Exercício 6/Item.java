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

class CD extends Item {
    
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

class Filmess extends Item {
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

class Jogoss extends Item {
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