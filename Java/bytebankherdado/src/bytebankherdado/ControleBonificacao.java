package bytebankherdado;

public class ControleBonificacao {
	
	double totalDeBonificacoes;
	
	public void registraBonificacao(Funcionario funcionario) {
		double bonificacoes = funcionario.getBonificacao();
		this.totalDeBonificacoes = this.totalDeBonificacoes  + bonificacoes;
	}
	
	
	public double getTotalBonificacoes() {
		return totalDeBonificacoes;
	}
	
}
