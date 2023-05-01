package bytebank;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double taxaSaque = 0.2;
		double valorFinal = valor + taxaSaque;
		return super.saca(valorFinal);
	}

	@Override
	public double getValorDoImposto() {
		return super.getSaldo() * 0.01;
	}
	
}
