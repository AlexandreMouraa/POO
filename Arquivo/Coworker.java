package Arquivo;

public class Coworker {

	String nome;
	char sexo;
	double salario;
	int dependentes;

	Coworker(String nome, char sexo, double salario, int dependentes) {
		this.nome = nome;
		this.sexo = sexo;
		this.salario = salario;
		this.dependentes = dependentes;
	}

	public double impostoRenda() {
		double reducaoDep = 189.59 * dependentes;
		if (salario <= 1903.98)
			return 0;
		else if (salario <= 2826.65)
			return (salario * 7.5 / 100 - 142.80) - reducaoDep;
		else if (salario <= 3751.05)
			return (salario * 15 / 100 - 354.80) - reducaoDep;
		else if (salario <= 4664.68)
			return (salario * 22.5 / 100 - 636.13) - reducaoDep;
		else
			return ((salario * 27.5 / 100) - 869.36) - reducaoDep;

	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public String mostraFuncionario() {
		return nome + ' ' + sexo + ' ' + salario + ' ' + dependentes + ' ' + impostoRenda();
	}
}