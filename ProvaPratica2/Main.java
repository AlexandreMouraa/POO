package ProvaPratica2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        List<Titular> listaTitulares = new ArrayList<>();

        int opcao;
        do
        {
            String input = JOptionPane.showInputDialog(
                    "CADASTRO DE TITULARES\n" +
                            "1 - Cadastrar Titular\n" +
                            "0 - Sair\n" +
                            "Digite a opção desejada:"
            );
            opcao = Integer.parseInt(input);

            if (opcao == 1)
            {
                String nome = JOptionPane.showInputDialog("Nome do Titular:");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do Titular:"));
                char sexo = JOptionPane.showInputDialog("Sexo do Titular (M ou F):").charAt(0);
                int numTitulo = Integer.parseInt(JOptionPane.showInputDialog("Número do Título do Titular:"));

                Titular titular = new Titular(nome, idade, sexo, numTitulo, new ArrayList<>());
                //O erro estava nessa linha eu nao tinha colocado o 'new ArrayList<>()'   :/
                listaTitulares.add(titular);

                String inputDependentes = JOptionPane.showInputDialog("Quantidade de Dependentes:");
                int quantidadeDependentes = Integer.parseInt(inputDependentes);

                if (quantidadeDependentes > 0)
                {
                    for (int i = 1; i <= quantidadeDependentes; i++)
                    {
                        String inputTipoDependente = JOptionPane.showInputDialog("Tipo do Dependente (1-filho, 2-cônjuge, 3-outro):");
                        int tipoDependente = Integer.parseInt(inputTipoDependente);

                        String nomeDependente = JOptionPane.showInputDialog("Nome do Dependente:");
                        int idadeDependente = Integer.parseInt(JOptionPane.showInputDialog("Idade do Dependente:"));
                        char sexoDependente = JOptionPane.showInputDialog("Sexo do Dependente (M ou F):").charAt(0);

                        Dependente dependente = new Dependente(tipoDependente, nomeDependente, idadeDependente, sexoDependente);
                        titular.associarObjetos(dependente);
                    }
                }
            }
        } while (opcao != 0);

        StringBuilder result = new StringBuilder();
        for (Titular titular : listaTitulares)
        {
            double mensalidadeTotal = titular.calcularValorMensalidade();
            result.append(titular.getNome()).append(": Mensalidade = R$").append(mensalidadeTotal).append("\n");
        }

        JOptionPane.showMessageDialog(null, "Mensalidades dos Sócios:\n" + result.toString());
    }

}

