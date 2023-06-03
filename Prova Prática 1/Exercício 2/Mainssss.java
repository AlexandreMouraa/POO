public class Mainssss {
    public static void main(String[] args) {

        Celular cel1 = new Celular("Apple", "Iphone 4s");

        cel1.setCor("Branco");
        System.out.println ("Celular 1: " + cel1);

        Celular cel2 = new Celular("Nokia");

        cel2.setCor("Preto");
        cel2.setModelo("XXX");
        System.out.println ("Celular 2: " + cel2);
    }
}