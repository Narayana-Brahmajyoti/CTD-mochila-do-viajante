public class Tabuleiro extends Brinquedo{
    //Herda tudo, menos o construtor do tabuleiro

    public Tabuleiro(String nome, String marca, int classificacaoIndicativa, boolean tipo, int idBrinquedo, int quantidade, int precoCompra){
        super(nome, marca, classificacaoIndicativa, tipo, idBrinquedo, quantidade, precoCompra); //esse é o construtor

    } //implementa a lógica da margem.. é abstract? Pegar preço da compra e margem
    public double precoVenda(double precoCompra){
        return estoque.getPrecoCompra() + (precoCompra * 0.3);
    }

}
