package Arquivo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExeTwoTwo 
{
    //Esse código utiliza o ObjectInputStream para ler os objetos do arquivo "funcionarios.obj". 
    //Ele verifica se cada objeto é uma instância de Funcionario, mostra os dados, 
    //calcula o imposto de renda e atualiza os totais de imposto da mesma forma que no item 1.
    public static void main(String[] args) {
        String arquivo = "funcionarios.obj";
        double totalImpostoFeminino = 0;
        double totalImpostoMasculino = 0;
        double totalImposto = 0;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo))) 
        {
            Object obj;
            while ((obj = ois.readObject()) != null) 
            {
                if (obj instanceof Coworker) 
                {
                    Coworker funcionario = (Coworker) obj;
                    System.out.println(funcionario.mostraFuncionario());

                    double imposto = funcionario.impostoRenda();
                    totalImposto += imposto;

                    if (funcionario.getSexo() == 'F') 
                        totalImpostoFeminino += imposto;
                    else if (funcionario.getSexo() == 'M') 
                        totalImpostoMasculino += imposto;
                }
            }
        } 
        catch (IOException | ClassNotFoundException e) 
        {
            System.out.println("Erro ao ler o arquivo de objetos: " + e.getMessage());
        }

        System.out.println("Total de imposto pago por funcionárias do sexo feminino: " + totalImpostoFeminino);
        System.out.println("Total de imposto pago por funcionários do sexo masculino: " + totalImpostoMasculino);
        System.out.println("Total de imposto pago por todos os funcionários: " + totalImposto);
    }
}
