
public abstract class ContaBancaria{
    double saldo;
    String numeroConta;

	public ContaBancaria(double saldo, String numeroConta) {
		super();
		this.saldo = saldo;
		this.numeroConta = numeroConta;
	}
    
	public void fazerDeposito(int valor) {
        this.saldo += valor;
    }
    
    public abstract void fazerLevantamento(int valor);
   
    
}


