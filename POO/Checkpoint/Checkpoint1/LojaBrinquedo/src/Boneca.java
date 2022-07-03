package lojabrinquedo;

public class Boneca extends Brinquedo {


    public Boneca(String nome, String marca, String classificacaoIndicativa, String idBrinquedo, int quantidade, double precoCompra) {
        super(nome, marca, classificacaoIndicativa, idBrinquedo, quantidade, precoCompra);
    }

    @Override
    public double getPrecoRevenda(double precoCompra) {
        return super.getPrecoCompra() + (super.getPrecoCompra() * 0.6);

    }
}