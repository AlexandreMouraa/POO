import java.util.List;

public class Principalll
{
    public static void main(String [] args)
    {
        Concessionaria local = new Concessionaria("Rap10");
        local.getEndereco().setRua("Alameda");
        local.getEndereco().setNumero(10);

        var BMWM8 = new Carro("BMW", "M8", 894, "Farol");
        var XRZ = new Moto("Yamaha", "XRZ", 2384, "Longa");

        local.AddCarro(BMWM8);
        local.AddCarro(XRZ);

        List <Veiculo> VEICULOS = local.getVeiculos();


        //O único erro dessa questão por falta de atenção,
        //foi não ter colocado os métodos toString(),
        //nas classes que herdam de veiculo, que são respectivamente
        //moto e carro, com isso não sai a impressao do acessório do carro
        //tanto quanto o tipo da moto, como foram colocados lgoo acima
        //ao declarar os objetos
        for(Veiculo VEICULOSs : VEICULOS)
        {
            System.out.println("Marca: " + VEICULOSs.getMarca());
            System.out.println("Modelo " + VEICULOSs.getModelo());
            System.out.println("Preço " + VEICULOSs.getPreco());
            System.out.println("-----------------------------------");
        }
    }
}
