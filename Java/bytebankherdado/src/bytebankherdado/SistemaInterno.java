package bytebankherdado;

public class SistemaInterno {
	
	int senha = 222;
	
	public void sutentica(Autentica fa) {
		boolean autenticou = fa.autentica(this.senha);
        if(autenticou) {
            System.out.println("Pode entrar no sistema!");
        } else {
            System.out.println("Não pode entrar no sistema!");
        }
	}

}
