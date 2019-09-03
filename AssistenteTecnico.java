
public class AssistenteTecnico extends Assistente {
	private double bonus=550;

	public AssistenteTecnico(String nome, String CPF, double salario, String matricula) {
		super(nome, CPF, salario, matricula);
	}
	
	@Override
	public void setSalario(double salario) {
		super.setSalario(salario+bonus);
	}
	
	
	@Override
	public void exibir() {
		setSalario(getSalario());
		super.exibir();
		System.out.println("O bônus é de: "+bonus);
	}

}
