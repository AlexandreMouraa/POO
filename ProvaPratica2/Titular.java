package ProvaPratica2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Titular extends Socio implements Associacao {
    private int numTitulo;
    private List<Dependente> dependente;

    Titular(String nome, int idade, char sexo, int numTitulo, List<Dependente> dependente)
    {
        super(nome, idade, sexo);
        this.numTitulo = numTitulo;
        this.dependente = new ArrayList<>();
    }

    public List<Dependente> getDependente()
    {
        return dependente;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Titular titular = (Titular) o;
        return numTitulo == titular.numTitulo && Objects.equals(dependente, titular.dependente);
    }

    @Override
    public void associarObjetos(Object obj)
    {
        if (obj instanceof Dependente)
        {
            Dependente dependente = (Dependente) obj;
            if (dependente.getTipo() == 1 || dependente.getTipo() == 2 || dependente.getTipo() == 3)
                this.dependente.add(dependente);
        }
    }

    @Override
    public String toString()
    {
        return "Número do Título: "+ numTitulo + "\nSeu nome: " + getNome() + "\nSua idade: " + getIdade() +
                "\nSeu sexo: " + getSexo();
    }

    @Override
    public double calcularValorMensalidade()
    {
        double total = super.calcularValorMensalidade();

        //E acabei notando que acabei esquecendo de colocar essas condições na prova *GIF de tristeza*  
        if(getIdade() >= 21 && getIdade() <= 65)
            total = 500;
        else
            total = 200;

        for (Dependente dependente : getDependente())
            total += dependente.calcularValorMensalidade();

        return total;
    }

    public void setDependente(List<Dependente> dependentes) 
    {
        this.dependente = dependentes;
    }
    //Aqui estava o outro erro, eu nao tinha completado o 'setDependente'
}
