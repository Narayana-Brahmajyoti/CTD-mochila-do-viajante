package lojabrinquedo;

public abstract class Brinquedo {

    private String nome;
    private String marca;
    private String classificacaoIndicativa;
    private String idBrinquedo;
    private double precoVenda;

    //Criando um atributo do tipo Classe
    private Estoque estoque;

    public Boneca getTipoBrinquedo1() {
        return tipoBrinquedo1;
    }

    public void setTipoBrinquedo1(Boneca tipoBrinquedo1) {
        this.tipoBrinquedo1 = tipoBrinquedo1;
    }

    public Carrinho getTipoBrinquedo2() {
        return tipoBrinquedo2;
    }

    public void setTipoBrinquedo2(Carrinho tipoBrinquedo2) {
        this.tipoBrinquedo2 = tipoBrinquedo2;
    }

    public Tabuleiro getTipoBrinquedo3() {
        return tipoBrinquedo3;
    }

    public void setTipoBrinquedo3(Tabuleiro tipoBrinquedo3) {
        this.tipoBrinquedo3 = tipoBrinquedo3;
    }

    private Boneca tipoBrinquedo1;
    private Carrinho tipoBrinquedo2;
    private Tabuleiro tipoBrinquedo3;



    public Brinquedo(String nome, String marca, String classificacaoIndicativa, String idBrinquedo, int quantidade, double precoCompra) {
        this.nome = nome;
        this.marca = marca;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.idBrinquedo = idBrinquedo;
        this.estoque = new Estoque(quantidade, precoCompra);

    }

    public void infosComuns(){
        System.out.println("\n" + "Informações Brinquedo: " + this.getNome());
        System.out.println("Marca do produto: " + this.getMarca());
        System.out.println("Classificação Indicativa do produto: " + this.getClassificacaoIndicativa());
        System.out.println("Identificação do produto: " + this.getIdBrinquedo());
        System.out.println("Tem o produto no estoque?: " + this.temEstoque());
        System.out.println("O valor unitário do produto para entrada no estoque foi: " + this.getPrecoCompra());
        System.out.println("O valor para revenda do produto é: " + this.PrecoVenda(this.getPrecoCompra()));
    }
    public abstract String imprimirInfosComuns();


    public double PrecoVenda(double precoCompra) {
        return precoVenda;
    }


    public boolean temEstoque(){
        boolean temEstoque = false;
        if (estoque.getQuantidade() > 0) {
            return temEstoque = true;
        } else {
            return false;
        }
    }


    // Acrescentei o get
    public double getPrecoCompra() {
        return this.estoque.getPrecoCompra();
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



