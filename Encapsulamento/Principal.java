
public class Principal 
{
    public static void main(String[] args) 
	{
        Elevador el1 = new Elevador(1, 500.0, 15);
        System.out.println(el1);

        /* mandar subir mas com o elevador desligado - não vai subir */
        el1.subir(5);
        System.out.println(el1);

        el1.ligar();
        System.out.println(el1);

        el1.subir(20);
        System.out.println(el1);

        el1.descer(10);
        System.out.println(el1);

        Elevador el2 = new Elevador(2, 400.0, 10);
        Elevador el3 = new Elevador(3, 400.0, 15);
        Elevador el4 = new Elevador(1, 400.0, 15);
        System.out.println(el2);

        el2.subir(2);
        System.out.println(el2);

        el2.ligar();
        System.out.println(el2);

        el2.subir(5);
        System.out.println(el2);

        el2.descer(10);
        System.out.println(el2);

        System.out.println(el3);

        System.out.println("------");

        System.out.println(el1.igual(el2));
        System.out.println(el1.igual(el4));

        System.out.println("Elevador : " + el1.getNumero() + " no andar " + el1.getQtdeAndares());
        System.out.println("Elevador : " + el2.getNumero() + " no andar " + el2.getQtdeAndares());
        System.out.println("Elevador : " + el3.getNumero() + " no andar " + el3.getQtdeAndares());
        System.out.println("Elevador : " + el4.getNumero() + " no andar " + el4.getQtdeAndares());
    }
}





