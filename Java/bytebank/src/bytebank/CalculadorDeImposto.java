package bytebank;

public class CalculadorDeImposto {
	
	private double totalDoImposto;
	
	public void registra(Tributavel t) {
		
		double valor = t.getValorDoImposto();
		this.totalDoImposto += valor;
	}
	
	public double getTotalDoImposto() {
		return totalDoImposto;
	}
	
}
