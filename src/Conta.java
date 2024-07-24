public abstract class Conta implements IConta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected int tipoConta;

    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente, int agencia, int tipoConta) {
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected void exibirExtrato() {
        System.out.println("Extrato Bancário");
        System.out.println(String.format("Titular da conta: %s", this.cliente.getNome()));
        System.out.println(String.format("Tipo da conta: %d", this.tipoConta));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número da conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    // Método para imprimir o extrato, que será implementado pelas classes filhas
    public abstract void imprimirExtrato();
}
