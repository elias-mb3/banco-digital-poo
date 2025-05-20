import model.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("001", "Maria");
        Conta cc = new ContaCorrente("123", 1000.0);
        Conta cp = new ContaPoupanca("456", 500.0);

        cliente.adicionarConta(cc);
        cliente.adicionarConta(cp);

        cc.transferir(cp, 200.0);

        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());
    }
}
