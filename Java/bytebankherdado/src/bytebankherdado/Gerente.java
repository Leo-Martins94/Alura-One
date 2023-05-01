package bytebankherdado;

public class Gerente extends Funcionario implements Autentica {
	
	private AutenticaUtil util;

    public Gerente() {
        this.util = new AutenticaUtil();
    }

	@Override
	public double getBonificacao() {
		return 50;
	}
	
	@Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.util.autentica(senha);
    }
	
}
