public class ContaPoupanca extends ContaBancaria{
    int limiteLevantamentos;
    int levantamentosFeitos;
    
    public void fazerLevantamento(int valor) {
    	if(this.levantamentosFeitos < this.limiteLevantamentos) {
    		this.saldo -= valor;
    		this.levantamentosFeitos++;
    	}
    }

	public ContaPoupanca(double saldo, String numeroConta, int limiteLevantamentos, int levantamentosFeitos) {
		super(saldo, numeroConta);
		this.limiteLevantamentos = limiteLevantamentos;
		this.levantamentosFeitos = levantamentosFeitos;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [limiteLevantamentos=" + limiteLevantamentos + ", \nlevantamentosFeitos="
				+ levantamentosFeitos + ", \nsaldo=" + saldo + ", \nnumeroConta=" + numeroConta + "]\n";
	}
	
    
}