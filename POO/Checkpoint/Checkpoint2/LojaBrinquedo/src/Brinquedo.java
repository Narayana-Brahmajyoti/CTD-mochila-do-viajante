package lojabrinquedo;

public abstract class Brinquedo {

    private String nome;
    private String marca;
    private String classificacaoIndicativa;
    private String idBrinquedo;
    private double precoVenda;

    //Criando um atributo do tipo Classe
    private Estoque estoque;

    

    public Brinquedo(String nome, String idBrinquedo, String marca, String classificacaoIndicativa) {
        this.nome = nome;
        this.idBrinquedo = idBrinquedo;
        this.marca = marca;
        this.classificacaoIndicativa = classificacaoIndicativa;


    }

    @Override
    public String toString() {
        return this.nome + "/n" 
        + this.idBrinquedo + "/n" 
        + this.marca + "/n" 
        + this.classificacaoIndicativa;
    }

    public Brinquedo (String nome, String idBrinquedo, String marca) {
        if (nome == null && idBrinquedo == null && marca == null ){
            throw new NullPointerException("Os Campos não podem ser nulos");
        }
        this.nome = nome;
        this.idBrinquedo = idBrinquedo;
        this.marca = marca;
    }

    /*
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
*/

}



