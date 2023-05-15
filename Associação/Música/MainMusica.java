public class MainMusica 
{
    public static void main(String[] args) 
    {
        Compositor compositor1 = new Compositor("Tom Jobim", "Brasil");
        Compositor compositor2 = new Compositor("Ludwig van Beethoven", "Alemanha");

        Musica musica1 = new Musica("Garota de Ipanema", 1962, "Bossa Nova", compositor1);
        Musica musica2 = new Musica("Ode to Joy", 1824, "Clássica", compositor2);

        System.out.println(musica1);
        System.out.println(musica2);
    }
}
