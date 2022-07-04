public class SaldoInsuficienteExceptionBuilder {
    private double valor;

    public SaldoInsuficienteExceptionBuilder setValor(double valor) {
        this.valor = valor;
        return this;
    }

    public Conta.SaldoInsuficienteException createSaldoInsuficienteException() {
        return new Conta.SaldoInsuficienteException(valor);
    }
}