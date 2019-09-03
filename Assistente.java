
public class Assistente extends Funcionarios {
	String matricula;
	
	public Assistente(String nome, String CPF, double salario, String matricula) {
		super(nome, CPF, salario);
		this.matricula=matricula;
	}

	public String getMatricula() {
		return matricula;
	}
	
	@Override
	public void exibir() {
		super.exibir();
		System.out.println("Matricula: "+getMatricula());
	}
	
	

}
