package ex1;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		GestorContactos gestorContactos = new GestorContactos();
		Contacto isidoro = new Contacto("Isidoro", "isi@gmail.com");
		isidoro.telemovel = "962445185";
		Contacto cristiano = new Contacto("Cristiano", "cr7@sapo.pt");
		Contacto diogo = new Contacto("Diogo", "d_amores@gmail.com");
		gestorContactos.adicionarContacto(isidoro);
		gestorContactos.adicionarContacto(cristiano);
		gestorContactos.adicionarContacto(diogo);
		
		Contacto encontrado = gestorContactos.procurarContacto("Diogo");
		System.out.println(encontrado.toString());
		String input = scanner.nextLine();
		System.out.println(input);
		scanner.close();
	}
}
