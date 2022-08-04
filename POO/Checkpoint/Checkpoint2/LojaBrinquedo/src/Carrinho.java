package lojabrinquedo;

public class Carrinho extends Brinquedo {

    private Brinquedo brinquedo;
    public Carrinho(String nome, String idBrinquedo, String marca, String classificacaoIndicativa) {
        super(nome, idBrinquedo, marca, classificacaoIndicativa);

    }


/*
    @Override
    public double PrecoVenda(double precoCompra) {
        return super.getPrecoCompra() + (super.getPrecoCompra() * 0.5);

    }

    @Override
    public void infosComuns() {
        System.out.println("\n" + "Informações Brinquedo: " + super.getNome());
        System.out.println("Marca do produto: " + super.getMarca());
        System.out.println("Classificação Indicativa do produto: " + super.getClassificacaoIndicativa());
        System.out.println("Identificação do produto: " + super.getIdBrinquedo());
        System.out.println("Tem o produto no estoque?: " + super.temEstoque());
        System.out.println("O valor unitário do produto para entrada no estoque foi: R$" + super.getPrecoCompra());
        System.out.println("O valor para venda do produto é de: R$" + this.PrecoVenda(super.getPrecoCompra()));

    }

    public String imprimirInfosComuns(){
        System.out.println("\n" +"-----Informações dos Carrinhos-----");
        this.infosComuns();

        return "----------XXXX----------";
    }
*/
}



