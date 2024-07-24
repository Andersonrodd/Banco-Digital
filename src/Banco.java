import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static final int TIPO_CORRENTE = 1;
    private static final int TIPO_POUPANCA = 2;

    private String nomeBanco;
    private int numeroAgencia;
    private List<Conta> listaContas;

    public Banco(String nomeBanco, int numeroAgencia) {
        this.nomeBanco = nomeBanco;
        this.numeroAgencia = numeroAgencia;
        this.listaContas = new ArrayList<>();
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public List<Conta> getListaContas() {
        return listaContas;
    }

    public void adicionarContaCorrente(String titular, int numConta) {
        listaContas.add(new ContaCorrente(new Cliente(titular, numConta), this.numeroAgencia, TIPO_CORRENTE));
    }

    public void adicionarContaPoupanca(String titular, int numConta) {
        listaContas.add(new ContaPoupanca(new Cliente(titular, numConta), this.numeroAgencia, TIPO_POUPANCA));
    }

    public void realizarSaque(int numConta, int tipoConta, double quantia) {
        System.out.println("Saque de " + quantia + " realizado!");
        for (Conta conta : listaContas) {
            if (conta.getCliente().getDocumento() == numConta && conta.getTipoConta() == tipoConta) {
                conta.sacar(quantia);
            }
        }
    }

    public void realizarDeposito(int numConta, int tipoConta, double quantia) {
        System.out.println("Depósito de " + quantia + " realizado!");
        for (Conta conta : listaContas) {
            if (conta.getCliente().getDocumento() == numConta && conta.getTipoConta() == tipoConta) {
                conta.depositar(quantia);
            }
        }
    }

    public void realizarTransferencia(int numContaOrigem, int tipoOrigem, int numContaDestino, int tipoDestino, double quantia) {
        System.out.println("Transferência de " + quantia + " realizado!");
        for (Conta conta : listaContas) {
            if (conta.getCliente().getDocumento() == numContaOrigem && conta.getTipoConta() == tipoOrigem) {
                conta.sacar(quantia);
            }
        }
        for (Conta conta : listaContas) {
            if (conta.getCliente().getDocumento() == numContaDestino && conta.getTipoConta() == tipoDestino) {
                conta.depositar(quantia);
            }
        }
    }

    public void mostrarExtrato(int numConta, int tipoConta) {
        for (Conta conta : listaContas) {
            if (conta.getCliente().getDocumento() == numConta && conta.getTipoConta() == tipoConta) {
                conta.imprimirExtrato();
            }
        }
    }

    public void exibirClientes() {
        System.out.println("CLIENTES CADASTRADOS");
        for (Conta conta : listaContas) {
            System.out.println(String.format("Cliente: %s - Número da Conta: %d", conta.getCliente().getNome(), conta.getCliente().getDocumento()));
        }
    }
}
