package Arquivo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecOne 
{
    public static void main(String[] args) 
    {
        String arquivo = "funcionarios.txt";
        double totalImpostoFeminino = 0;
        double totalImpostoMasculino = 0;
        double totalImposto = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) 
        {
            String linha;
            while ((linha = br.readLine()) != null) 
            {
                String[] campos = linha.split("#");
                String nome = campos[0];
                char sexo = campos[1].charAt(0);
                double salario = Double.parseDouble(campos[2]);
                int dependentes = Integer.parseInt(campos[3]);

                Coworker funcionario = new Coworker(nome, sexo, salario, dependentes);
                System.out.println(funcionario.mostraFuncionario());

                double imposto = funcionario.impostoRenda();
                totalImposto += imposto;

                if (sexo == 'F') 
                    totalImpostoFeminino += imposto;
                else if (sexo == 'M') 
                    totalImpostoMasculino += imposto;
            }
        } 
        catch (IOException e)   
        {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        System.out.println("Total de imposto pago por funcionárias do sexo feminino: " + totalImpostoFeminino);
        System.out.println("Total de imposto pago por funcionários do sexo masculino: " + totalImpostoMasculino);
        System.out.println("Total de imposto pago por todos os funcionários: " + totalImposto);
    }
    
}
