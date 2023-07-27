package ProvaPratica2;

public class Dependente extends Socio
{
    private int tipo;
    private Titular numTitulo;

    Dependente(int tipo, String nome, int idade, char sexo)
    {
        super(nome, idade, sexo);
        this.tipo = tipo;
    }

    public Titular getNumTitulo() {
        return numTitulo;
    }

    @Override
    public double calcularValorMensalidade()
    {
        double mensalidade = 0;
        if(tipo == 1 || tipo == 2)
        {
            if(getIdade() <= 10)
                mensalidade += 100;
            else if(getIdade() > 10 && getIdade() <= 21)
                mensalidade += 150;
            else if(getIdade() > 21 && getIdade() <= 65)
                mensalidade += 200;
            else
                mensalidade += 80;
        }
        else
        {
            if(getIdade() <= 65)
                mensalidade += 250;
            else
                mensalidade += 150;
        }

        return mensalidade;
    }

    public int getTipo()
    {
        return tipo;
    }

    public String toString()
    {
        return "Seu tipo:" + tipo + "\nSeu nome: " + getNome() + "\nSua idade: " + getIdade() +
                "\nSeu sexo: " + getSexo();
    }
}

