public class RoboAspirador {
    private int numero;
    private String status;
    private int posicaoX;
    private int posicaoY;
    private int quantidadePo;
    private int limitePo;

    public RoboAspirador(int numero, int limitePo) {
        this.numero = numero;
        this.status = "desligado";
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.quantidadePo = 0;
        this.limitePo = limitePo;
    }

    public void ligar() {
        if (status.equals("desligado")) {
            status = "ligado";
            System.out.println("Robô " + numero + " ligado.");
        }
    }

    public void desligar() {
        if (status.equals("ligado")) {
            status = "desligado";
            System.out.println("Robô " + numero + " desligado.");
        }
    }

    public void andar(int deslocamentoX, int deslocamentoY) {
        if (status.equals("ligado")) {
            posicaoX += deslocamentoX;
            posicaoY += deslocamentoY;
            status = "andando";
            System.out.println("Robô " + numero + " andando para (" + posicaoX + "," + posicaoY + ").");
        }
    }

    public void aspirar(int quantidadePoASpirar) {
        if (status.equals("ligado")) {
            quantidadePo += quantidadePoASpirar;
            System.out.println("Robô " + numero + " aspirou " + quantidadePoASpirar + " de pó.");
            if (quantidadePo >= limitePo) {
                desligar();
                System.out.println("Robô " + numero + " atingiu o limite de pó e foi desligado.");
            }
        }
    }

    public void parar() {
        if (status.equals("andando")) {
            status = "parado";
            System.out.println("Robô " + numero + " parado.");
        }
    }

    public String toString() {
        return "Robô " + numero + " - Status: " + status + ", Posição: (" + posicaoX + "," + posicaoY + "), Quantidade de Pó: " + quantidadePo + ", Limite de Pó: " + limitePo;
    }
}

class Principal {
    public static void main(String[] args) {
        RoboAspirador robo1 = new RoboAspirador(1, 100);
        RoboAspirador robo2 = new RoboAspirador(2, 150);

        robo1.ligar();
        System.out.println(robo1);
        robo1.andar(2, 3);
        System.out.println(robo1);
        robo1.aspirar(50);
        System.out.println(robo1);
        robo1.parar();
        System.out.println(robo1);
        robo1.desligar();
        System.out.println(robo1);

        robo2.ligar();
        System.out.println(robo2);
        robo2.andar(-1, 4);
        System.out.println(robo2);
        robo2.aspirar(120);
        System.out.println(robo2);
        robo2.parar();
        System.out.println(robo2);
        robo2.desligar();
        System.out.println(robo2);
    }
}
