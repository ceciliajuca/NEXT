
public class Funcionarios {

	private String nome, CPF;
	private double salario;
	
	public Funcionarios (String nome, String CPF, double salario) {
		this.nome=nome;
		this.CPF=CPF;
		this.salario= salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void exibir () {
		System.out.println("-------------------");
		System.out.println("Nome: "+getNome());
		System.out.println("CPF: "+getCPF());
		System.out.println("Salário: "+getSalario());
		
	}
	
	
}
