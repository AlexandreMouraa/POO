import java.util.List;

public class Principalll
{
    public static void main(String [] args)
    {
        Concessionaria local = new Concessionaria("Rap10");
        local.getEndereco().setRua("Alameda");
        local.getEndereco().setNumero(10);

        Carro BMWM8 = new Carro("BMW", "M8", 894, "Farol");
        Moto XRZ = new Moto("Yamaha", "XRZ", 2384, "Longa");

        local.AddCarro(BMWM8);
        local.AddCarro(XRZ);

        List <Veiculo> VEICULOS = local.getVeiculos();

        for(Veiculo VEICULOSs : VEICULOS)
        {
            System.out.println("Marca: " + VEICULOSs.getMarca());
            System.out.println("Modelo " + VEICULOSs.getModelo());
            System.out.println("Preço " + VEICULOSs.getPreco());
            System.out.println("-----------------------------------");
        }
    }
}
