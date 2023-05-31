public class Robo 
{
    
    private int posicaoX;
    private int posicaoY;
    private int QuantidadedePo;
    private int LimitedePo = 100;
    private boolean ligado = false;
    private int identificacao;
    private boolean Andar = false;

    public Robo(int identificacao)
    {
        this.identificacao = identificacao;
    }

    //Ligar o Robo
    public boolean LigarRobo()
    {   
        return ligado;
    }

    //DesligarRobo
    public boolean DesligarRobo()
    {
        return ligado;
    }

    //Andar PosicaoX
    public void AndarPosicaoX(int Posicao)
    {

    }

    //Andar PosicaoY
    public void AndarPosicaoY(int Posicao)
    {

    }

    public void Parar()
    {
        
    }

    public int Limite(int QuantoAspirado)
    {
        return QuantoAspirado - LimitedePo;
    }   

    public String Andar()
    {
        if(Andar)
        {
            return " ";
        }
        else
        {
            return "";
        }
    }

    public String toString()
    {
        if(ligado)
            return "O Status do Robo " + identificacao + " atual é ligado + " + "\nNo momento o aspirador está andando";

        else
            return "Os status do Robo " + identificacao + " atual é desligado" + "\nNo momento o aspirador está parado";
    }


}
