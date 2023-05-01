package bytebankherdado;

public class TesteDeReferencia {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registraBonificacao(g1);

        System.out.println(controle.getTotalBonificacoes());

	}

}
