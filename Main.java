public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

    cp.imprimir();
    cc.imprimir();

    cc.depositar(258885);
    cc.transferir(2588,cp );

    cp.imprimir();
    cc.imprimir();

    }
}
