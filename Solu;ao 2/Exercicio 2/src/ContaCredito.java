public class ContaCredito extends ContaBancaria{
    double valorPorDebitar;
    
    public void fazerLevantamento(int valor) {
    	this.valorPorDebitar -= valor;
    }

	public ContaCredito(double saldo, String numeroConta, double valorPorDebitar) {
		super(saldo, numeroConta);
		this.valorPorDebitar = valorPorDebitar;
	}

	@Override
	public String toString() {
		return "ContaCredito [valorPorDebitar=" + valorPorDebitar + ", \nsaldo=" + saldo + ", \nnumeroConta=" + numeroConta
				+ "]\n";
	}


    
}
