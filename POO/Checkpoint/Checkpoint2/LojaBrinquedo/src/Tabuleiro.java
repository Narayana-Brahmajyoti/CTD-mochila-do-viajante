package lojabrinquedo;

public class Tabuleiro extends Brinquedo {
    public static int setNome;
    private Brinquedo brinquedo;
    //Herda tudo, menos o construtor do tabuleiro

    public Tabuleiro(String nome, String idBrinquedo) {
        super(nome, idBrinquedo);

    }


/*
    //implementa a lógica da margem.. é abstract? Pegar preço da compra e margem



    @Override
    public double PrecoVenda(double precoCompra) {
        return super.getPrecoCompra() + (super.getPrecoCompra() * 0.3);
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
        System.out.println("\n" +"-----Informações dos Jogos de tabuleiros-----");
        this.infosComuns();

        return "----------XXXX----------";
    }
*/

}

