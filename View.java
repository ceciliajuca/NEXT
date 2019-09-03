
public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionarios funcionario1 = new Funcionarios("Joao", "1", 2000);
		Funcionarios funcionario2 = new Funcionarios("Cecilia", "2", 2000);
		Assistente assistente1 = new Assistente("Rafael", "3", 5, "matricularafael");
		AssistenteTecnico assisttech1= new AssistenteTecnico("Marina", "4", 2000,"matriculamarina");
		
		
		funcionario1.exibir();
		funcionario2.exibir();
		assistente1.exibir();
		assisttech1.exibir();
	}

}
