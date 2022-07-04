public abstract class Conta implements InterConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override //subtrai da conta o valor dado como parâmetro
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override //soma a conta o valor dado como parâmetro
    public void depositar(double valor) {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteExceptionBuilder().setValor(valor).createSaldoInsuficienteException();
        } else {
            this.saldo += valor;
        }
    }


    @Override //saca o valor dado como parâmetro da conta que chama o método e deposita para a conta destino dado como parâmetro
    public void transferir(double valor, InterConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    //os gets permite a leitura dos atributos privados e protegidos pelas classes filhas
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    //imprimi e formata as informações do cliente de uma vez, sem a necessidade de chamar cada campo separado.
    protected void imprimirInfos() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
