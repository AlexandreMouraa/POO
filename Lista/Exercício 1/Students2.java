public class Students2 
{
    private String name;
    private int matricula;
    private int idade;
    private Curse curso;

    public Students2(String name, int matricula, int idade)
    {
        this.name = name;
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) 
    {
        this.matricula = matricula;
    }

    public int getIdade() 
    {
        return idade;
    }

    public void setIdade(int idade) 
    {
        this.idade = idade;
    }

    public Curse getCurso() 
    {
        return curso;
    }

    public void setCurso(Curse curso) 
    {
        this.curso = curso;
    }

    public String toString()
    {
        return "O nome do Aluno é: " + name + "\nSua idade é de: " + idade + "\nCom matrícula do curso de Nr°: " + matricula + 
        "\nAtualmente no curso de " + curso.getNome();
    }
 

}
