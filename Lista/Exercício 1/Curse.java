public class Curse 
{

    private String nome;
    private int ano;
    private int duracao;

    Curse(String nome, int ano, int duracao)
    {
        this.nome = nome;
        this.ano = ano;
        this.duracao = duracao;
    }

    public int getAno()
    {
        return ano;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getDuracao()
    {
        return duracao;
    }

    public void setDuracao(int duracao)
    {
        this.duracao = duracao;
    }

    public String toString()
    {
        return "Curso: " + nome + "\nSua duração é de: " + duracao + "\nTeve início no ano de: " + ano;
    }
}

class Students {

	private String nome;
	private int matricula;
	private int ano;
	private String curso;
	
	Students (String nome) {
		this.nome = nome;
	}
	
	public void matricular (int matricula, String curso, int ano) {
		this.matricula = matricula;
		this.ano = ano;
		this.curso = curso;
	}
	
	public String toString() {
		return "Aluno : "+ nome + " - matricula : " + matricula + " - Curso : " + curso + " - " + ano;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}

class Students2 
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

