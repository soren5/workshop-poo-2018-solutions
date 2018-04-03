
public class ContaDebito extends ContaBancaria{

    public ContaDebito(double saldo, String numeroConta) {
		super(saldo, numeroConta);
	}

	@Override
	public String toString() {
		return "ContaDebito [saldo=" + saldo + ", \nnumeroConta=" + numeroConta + "]\n";
	}

    public void fazerLevantamento(int valor) {
    	if(this.saldo >= 0) {
    		this.saldo -= valor;
    	}
    }
    
}
