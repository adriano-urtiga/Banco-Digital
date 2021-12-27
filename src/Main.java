

public class Main {
    public static void main(String[] args) {

        Cliente Adriano = new Cliente();
        Adriano.setNome("Adriano");
        Conta cc = new ContaCorrente(Adriano);
        Conta cp = new ContaPoupanca(Adriano);

        cc.depositar(100);
        cp.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
