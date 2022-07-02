public class Reparo implements EstadoReparo {
    private String nome, enderecoEntrega;
    private double valor;
    private EstadoReparo estado;

    public Reparo(String nome, String enderecoEntrega, double valor) {
        this.nome = nome;
        this.enderecoEntrega = enderecoEntrega;
        this.valor = valor;
    }


    @Override
    public void mudarEndereco(String endereco) {
        this.enderecoEntrega = endereco;
    }

    @Override
    public void darOrcamento(double valor) {
        this.valor = valor;

    }

    @Override
    public void adicionarItensExtras(double valorExtra) {
        this.valor += valorExtra;
    }

    @Override
    public void mudarEstado() {

    }

    public double getValor() {
        return valor;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getnome;
}
