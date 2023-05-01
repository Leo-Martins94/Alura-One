package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		
		ContaCorrente primeiraConta = new ContaCorrente(123, 2569);
		
		primeiraConta.deposita(200);
		
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.deposita(200);
		
		System.out.println("Depositando R$ 100 - Saldo atual: " + primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		
		segundaConta.deposita(50);
		
		System.out.println("Saldo da segunda conta " + segundaConta.getSaldo());
		
	}
}
