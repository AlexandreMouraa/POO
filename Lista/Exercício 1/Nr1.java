public class Nr1 {

    public static void main(String[] args) {

        Students Aluno1 = new Students("Alexandre");
        Aluno1.matricular(202885419, "Sistemas de Informação", 2015);

        System.out.println(Aluno1.toString());

        Aluno1.setCurso("Eng. de Software");
        Aluno1.setAno(2022);

        System.out.println(Aluno1.toString());
    }
    
}
