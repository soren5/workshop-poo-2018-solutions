package ex1;

public class Contacto {
	   String nome;
	   String email;
	   String telemovel;
	   
	public Contacto(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contacto [nome=" + nome + ", \nemail=" + email + ", \ntelemovel=" + telemovel + "]";
	}
	   
	
	   
}
