public class CadastroMultiplo {
	
	public static void main(String[] args) {
		
		Cliente[] cliente = new Cliente[5];
		
		cliente[0] = new Cliente("Maria");
		cliente[0].setIdade(20);
		cliente[0].setTelefone("999-8899");
		
		/* complete aqui  */

        cliente[1] = new Cliente("Alexandre");
		cliente[1].setIdade(22);
		cliente[1].setTelefone("999-8887");

        cliente[2] = new Cliente("Jonh");
		cliente[2].setIdade(27);
		cliente[2].setTelefone("999-3423");

        cliente[3] = new Cliente("Olaf");
		cliente[3].setIdade(29);
		cliente[3].setTelefone("999-5894");

        cliente[4] = new Cliente("Duda");
		cliente[4].setIdade(19);
		cliente[4].setTelefone("999-2932");
		
		for (int i = 0; i < cliente.length; i++)
			System.out.println(cliente[i]);
	}
}
