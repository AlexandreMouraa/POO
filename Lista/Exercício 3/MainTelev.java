public class MainTelev 
{
    public static void main(String [] args)
    {
        //Automaticamente começam com 0 no construtor.
        Televisao Tela1 = new Televisao();

        //Mostrando Volume e Canal atual com a TV desligada
        System.out.println(Tela1);

        //Mostrando que o contador está funcionando
        System.out.println("O contador do construtor é: " + Televisao.GetCont());
        System.out.println();

        //Mostrando que mesmo mudando de canal com ela desligada não haverá alteração
        //ela só muda de canal ligada
        Tela1.MudarCanal(3);
        Tela1.AumentarVolume(25);

        //Sua Situação Atual
        System.out.println("Sua situação atual mudando o canal e volume com ela desligada é: (Não haverá mudança com ela desligada)");
        System.out.println(Tela1);

        //Ligando a TV
        Tela1.LigarTV();
        System.out.println();

        //Situaçao atual
        System.out.println("Sua situação atual depois de ligar ela sem alterar canais e volume:");
        System.out.println(Tela1);
        System.out.println();

        //Alterando o canal e volume com ela ligada nesse momento
        Tela1.MudarCanal(3);
        Tela1.AumentarVolume(25);

        //Sua Situação Atual
        System.out.println("Sua situação atual depois de alterar canais e volume:");
        System.out.println(Tela1);
        System.out.println();

        //Desligando a TV
        Tela1.DesligarTV();

        //Sua situação atual
        System.out.println("Sua situação atual depois de desligar a TV:");
        System.out.println(Tela1);
        System.out.println();

        //Mostrando o contador do construtor:
        System.out.println("O contador do construtor é: " + Televisao.GetCont()); 
        //Automaticamente quando "chamá-lo" novamente, o canal e volume estarão em Zero. Mesmo que no Desligar eles já tenha sido zerados
    }
    
}
