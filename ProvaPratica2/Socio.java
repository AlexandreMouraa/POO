package ProvaPratica2;

public abstract class Socio
{
    private String nome;
    private int idade;
    private char sexo;

    Socio(String nome, int idade, char sexo)
    {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public double calcularValorMensalidade()
    {
        return 0;
    }
}

