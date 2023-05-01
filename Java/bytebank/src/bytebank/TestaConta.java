package bytebank;

public class TestaConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 2563);
		ContaPoupanca cp = new ContaPoupanca(111, 2365);
		
		cc.deposita(100);
		cp.deposita(100);
		
		cc.transfere(10, cp);
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());

	}

}
