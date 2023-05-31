public class MainRobo 
{
    public static void main(String [] args)
    {
        Robo R1D1 = new Robo(123456789);
        Robo R2D2 = new Robo(987654321);

        System.out.println("O status do Robo aspirador atual com os dois desligados é: ");
        System.out.println("O status do Robo 1 é: " + R1D1);
        System.out.println("O status do Robo 2 é: " + R2D2);
        System.out.println();

        System.out.println("Ligando o robo 1...");
        R1D1.LigarRobo();

        //Status dos dois Robos com 1 ligado e o outro desligado
        System.out.println("O status dos robos com o 1 ligado e o 2 desligado:");
        System.out.println("O status do Robo 1 é: " + R1D1);
        System.out.println("O status do Robo 2 é: " + R2D2);
        System.out.println();

        //Ligando o Robo 2
        System.out.println("Ligando o robo 2...");
        R2D2.LigarRobo();

        //Status dos dois robos com eles ligados
        System.out.println("Status dos dois robos com eles ligados:");
        System.out.println("O status do Robo 1 é: " + R1D1);
        System.out.println("O status do Robo 2 é: " + R2D2);
        System.out.println();

        //Andando com os robos
        System.out.println("Começando a andar com os dois robos: ");
        R1D1.AndarPosicaoX(2);
        R1D1.AndarPosicaoY(5);

        //Mostrando seus status com um dos robos que esta se movimentando
        System.out.println("Status dos dois robos se movimentando...");

    }
}
