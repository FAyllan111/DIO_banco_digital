public abstract class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static  int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldoConta;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }


    public void sacar(double valor){
        this.saldoConta -= valor;
    }

    public void depositar(double valor){
        this.saldoConta += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimir(){
        System.out.println(this.agencia);
        System.out.println(this.numeroConta);
        System.out.println(this.saldoConta);
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}
