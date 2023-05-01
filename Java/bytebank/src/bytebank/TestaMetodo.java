package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		
		Conta contaLeo = new ContaCorrente(055, 3687);
		Conta contaAna = new ContaCorrente(056, 6985);
		
		contaLeo.deposita(1000);
		System.out.println(contaLeo.getSaldo());
		
		contaLeo.saca(500);
		System.out.println(contaLeo.getSaldo());
		
		contaLeo.transfere(300, contaAna);
		System.out.println(contaLeo.getSaldo());
		System.out.println("O Saldo de Ana é: " + contaAna.getSaldo());
	}
}
