package ex1;

public class GestorContactos {
	   // Atributos:
	   Contacto [] osMeusAmigos;
	   int numAmigos;
	   
	   // Construtor:
	   GestorContactos(){
	      this.numAmigos = 0;
	      this.osMeusAmigos = new Contacto[500];
	   }
	   
	   // Metodos:
	   void adicionarContacto(Contacto contacto) {
		   if(this.numAmigos < 50) {
			   this.osMeusAmigos[this.numAmigos] = contacto;
			   this.numAmigos++;
		   }
	   }
	   
	   Contacto procurarContacto(String nomeDoContacto) {
		   for(int i = 0; i < this.numAmigos; i++) {
			   if(this.osMeusAmigos[i].nome.equals(nomeDoContacto)) {
				   return this.osMeusAmigos[i];
			   }
		   }
		   return null;
	   }
}
