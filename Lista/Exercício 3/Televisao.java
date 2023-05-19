public class Televisao 
{
    private int Canal;
    private int volume;
    private static int cont = 0;

    public Televisao()
    {
        if(cont == 0)
        {
            volume = 0;
            Canal = 0;
        }
        cont++;
    }

    public void AumentarVolume(int Aumentar)
    {
        volume += Aumentar;
    }

    public void DiminuirVolume(int Diminuir)
    {
        volume -= Diminuir;
    }

    public void MudarCanal(int Qual)
    {
        Canal += Qual;
    }

    @Override
    public String toString()
    {
        return "O canal atual é: " + Canal + "\nO volume está em: " + volume;
    }
}
