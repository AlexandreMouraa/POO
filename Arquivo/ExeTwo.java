package Arquivo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class ExeTwo 
{

    //Esse código lê o arquivo "funcionarios.txt" linha por linha, 
    //separa os campos e instancia um objeto Funcionario para cada linha. Em seguida, 
    //utiliza o ObjectOutputStream para gravar cada objeto no arquivo de saída "funcionarios.obj".
    public static void main(String[] args) 
    {
        String arquivoEntrada = "funcionarios.txt";
        String arquivoSaida = "funcionarios.obj";
        
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoEntrada));
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivoSaida))) 
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
                oos.writeObject(funcionario);
            }

            System.out.println("Dados gravados em " + arquivoSaida);
        } 
        catch (IOException e) 
        {
            System.out.println("Erro ao ler o arquivo ou gravar os objetos: " + e.getMessage());
        }
    }    
    
}
