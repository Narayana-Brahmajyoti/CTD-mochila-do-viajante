package lojabrinquedo;

public class Brinquedo {

    private String nome;
    private String marca;
    private String classificacaoIndicativa;
    private String idBrinquedo;

    //Criando um atributo do tipo Classe
    private Estoque estoque;


    public Brinquedo(String nome, String marca, String classificacaoIndicativa, String idBrinquedo, int quantidade, double precoCompra) {
        this.nome = nome;
        this.marca = marca;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.idBrinquedo = idBrinquedo;
        this.estoque = new Estoque(quantidade, precoCompra);
    }

    public boolean temEstoque() {
        if (estoque.getQuantidade() > 0) {
            return true;

        } else {
            return false;
        }
    }

    // Acrescentei o get
    public double getPrecoCompra() {
        return this.estoque.getPrecoCompra();
    }

    public double getPrecoRevenda(double precoCompra) {
        return this.estoque.getPrecoCompra() + (this.getPrecoCompra() * 0.5);
    }

    public String getNome() {
        return nome;
    }

    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }
    public String getIdBrinquedo() {
        return idBrinquedo;
    }

    public String getMarca() {
        return marca;
    }

}



