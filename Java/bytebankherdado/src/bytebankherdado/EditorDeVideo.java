package bytebankherdado;

public class EditorDeVideo extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Bonificação de Editor de Video");
		return (this.getSalario()/2);
	}
	
}
