public class Televisao 
{
    private int Canal;
    private int volume;
    private static int cont = 0;
    boolean Ligada = false;

    public Televisao()
    {
        if(cont == 0)
        {
            volume = 0;
            Canal = 0;
        }
        cont++;
    }

    public boolean LigarTV()
    {
        if(cont > 0)
            Ligada = true; 

        return Ligada;
    }

    public boolean DesligarTV()
    {
        volume = 0;
        Canal = 0;
        cont = 0;
        Ligada = false;

        return Ligada;
    }

    public void AumentarVolume(int Aumentar)
    {
        if(Ligada)
            volume += Aumentar;
    }

    public void DiminuirVolume(int Diminuir)
    {
        if(Ligada)
            volume -= Diminuir;
    }

    public void MudarCanal(int Qual)
    {
        if(Ligada)
            Canal += Qual;
    }

    public static int GetCont()
    {
        return cont;
    }

    @Override
    public String toString()
    {
        if(Ligada)
            return "A Tv está ligada " + "\nO canal atual é: " + Canal + "\nO volume está em: " + volume;

        else
            return "A Tv está desligada " + "\nO canal atual é: " + Canal + "\nO volume está em: " + volume;
    }
}
