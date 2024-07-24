public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, int agencia, int tipoConta) {
        super(cliente, agencia, tipoConta);
    }

    @Override
    public void imprimirExtrato() {
        exibirExtrato();
    }
}
