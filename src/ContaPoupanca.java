public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, int agencia, int tipoConta) {
        super(cliente, agencia, tipoConta);
    }

    @Override
    public void imprimirExtrato() {
        exibirExtrato();
    }
}
