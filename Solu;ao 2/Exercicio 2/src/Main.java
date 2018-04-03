import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		main2();
		
	}
	
	static void main1() {
		ContaCredito contaCredito = new ContaCredito(100, "1234", 0);
		ContaDebito contaDebito = new ContaDebito(0, "1333");
		ContaPoupanca contaPoupanca = new ContaPoupanca(100, "2255", 2, 0);

		contaCredito.fazerLevantamento(100);
		contaCredito.fazerDeposito(100);

		System.out.println(contaCredito.toString());
		
		contaDebito.fazerDeposito(10);
		contaDebito.fazerLevantamento(20);
		System.out.println(contaDebito.toString());

		contaDebito.fazerLevantamento(10);
		System.out.println(contaDebito.toString());
		
		contaDebito.fazerDeposito(30);
		contaDebito.fazerLevantamento(10);
		System.out.println(contaDebito.toString());

		contaPoupanca.fazerLevantamento(1);
		contaPoupanca.fazerLevantamento(1);
		contaPoupanca.fazerLevantamento(1);
		System.out.println(contaPoupanca.toString());
	}
	
	static void main2() {
		ContaCredito contaCredito = new ContaCredito(100, "1234", 0);
		ContaDebito contaDebito = new ContaDebito(0, "1333");
		ContaPoupanca contaPoupanca = new ContaPoupanca(100, "2255", 2, 0);

		ArrayList<ContaBancaria> listaContas = new ArrayList();
		listaContas.add(contaCredito);
		listaContas.add(contaDebito);
		listaContas.add(contaPoupanca);
		
		System.out.println(contaCredito);
		System.out.println(contaDebito);
		System.out.println(contaPoupanca);
		
		for(int i = 0; i < listaContas.size(); i++) {
			listaContas.get(i).fazerDeposito(20);
			listaContas.get(i).fazerLevantamento(10);
		}		
		
		System.out.println(contaCredito);
		System.out.println(contaDebito);
		System.out.println(contaPoupanca);
	}
	
}
