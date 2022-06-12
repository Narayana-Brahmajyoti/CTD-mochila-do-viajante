public class Brinquedo {

    private String nome;
    private String marca;
    private int classificacaoIndicativa;
    private double preco;
    private boolean tipo;
    private int idBrinquedo;
    //Criando um atributo do tipo Classe
    private Estoque estoque;

    public Brinquedo (String nome, String marca, int classificacaoIndicativa, boolean tipo, int idBrinquedo, int quantidade, int precoCompra){
        this.nome =nome;
        this.marca= marca;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.estoque = new Estoque(quantidade, precoCompra);

    }
    public boolean temEstoque(){
        if(estoque.getQuantidade() > 0){
            return true;
        } else {
            return false;
        }
    }
    public double precoVenda(double precoCompra){
        return estoque.getPrecoCompra() + (precoCompra * 0.5);
    }

}
