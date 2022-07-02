package lojabrinquedo;
public class Estoque {

    private int quantidade;
    private double precoCompra;

    private double precoRevenda;


    public Estoque(int quantidade, double precoCompra) {
        this.quantidade = quantidade;
        this.precoCompra = precoCompra;
    }

    //Pega o valor que está entrando e soma com a quantidade
    public int entradaEstoque(int valor){
        return this.quantidade += valor;

    }
    public int saidaEstoque(int valor){
        return this.quantidade -= valor;

    }
    //cria os getters
    public int getQuantidade(){
        return this.quantidade; //this referencia o atributo da sua classe

    }

    public double getPrecoCompra() {
        return this.precoCompra;
    }


}
