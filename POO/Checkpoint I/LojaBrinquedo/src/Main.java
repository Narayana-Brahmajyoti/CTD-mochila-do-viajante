package lojabrinquedo;

public class Main {
    public static void main(String[] args) {
        Brinquedo brinquedo1 = new Brinquedo("Verdade ou Desafio", "Estrela", "12 anos", "Brin-001", 10,299);
        Brinquedo brinquedo2 = new Brinquedo("Quebra Cabeça - 500 peças", "Estrela", "10 anos", "Brin-002", 10,359);
        Brinquedo brinquedo3 = new Brinquedo("Quebra Cabeça - 300 peças", "Estrela", "5 anos", "Brin-003", 15,300);

        //Brinquedo 1
        System.out.println("\n" + "Informações Brinquedo: " +brinquedo1.getNome());
        System.out.println("Marca do produto: " + brinquedo1.getMarca());
        System.out.println("Classificação Indicativa do produto: " + brinquedo1.getClassificacaoIndicativa());
        System.out.println("Identificação do produto: " + brinquedo1.getIdBrinquedo());
        System.out.println("Tem o produto no estoque?: " + brinquedo1.temEstoque());
        System.out.println("O valor unitário do produto para entrada no estoque foi: " + brinquedo1.getPrecoCompra());
        System.out.println("O valor para revenda do produto é: " + brinquedo1.getPrecoRevenda(brinquedo1.getPrecoCompra()));

        //Brinquedo 2
        System.out.println("\n" + "Informações Brinquedo: " +brinquedo2.getNome());
        System.out.println("Marca do produto: " + brinquedo2.getMarca());
        System.out.println("Classificação Indicativa do produto :" + brinquedo2.getClassificacaoIndicativa());
        System.out.println("Identificação do produto: " + brinquedo2.getIdBrinquedo());
        System.out.println("Tem o produto no estoque?: " + brinquedo2.temEstoque());
        System.out.println("O valor unitário do produto para entrada no estoque foi: " + brinquedo2.getPrecoCompra());
        System.out.println("O valor para revenda do produto é: " + brinquedo2.getPrecoRevenda(brinquedo2.getPrecoCompra()));

        //Brinquedo 3
        System.out.println("\n" + "Informações Brinquedo: " +brinquedo3.getNome());
        System.out.println("Marca do produto: " + brinquedo3.getMarca());
        System.out.println("Classificação Indicativa do produto: " + brinquedo3.getClassificacaoIndicativa());
        System.out.println("Identificação do produto: " + brinquedo3.getIdBrinquedo());
        System.out.println("Tem o produto no estoque?: " + brinquedo3.temEstoque());
        System.out.println("O valor unitário do produto para entrada no estoque foi: " + brinquedo3.getPrecoCompra());
        System.out.println("O valor para revenda do produto é: " + brinquedo3.getPrecoRevenda(brinquedo3.getPrecoCompra()));

        Tabuleiro tabuleiro1 = new Tabuleiro("Cara a cara", "Estrela", "6 anos", "Tab-001", 3,75.0);
        Tabuleiro tabuleiro2 = new Tabuleiro("Xadrez", "Big Boy", "6 anos", "Tab-002", 7,18.5);
        Tabuleiro tabuleiro3 = new Tabuleiro("Roleta Cassino", "Nig Brinquedos", "8 anos", "Tab-003", 4,37.1);

        //Tabuleiro 1
        System.out.println("\n" + "Informações Brinquedo: " + tabuleiro1.getNome());
        System.out.println("Marca do produto: " + tabuleiro1.getMarca());
        System.out.println("Classificação Indicativa do produto: " + tabuleiro1.getClassificacaoIndicativa());
        System.out.println("Identificação do produto: " + tabuleiro1.getIdBrinquedo());
        System.out.println("Tem o produto no estoque?: " + tabuleiro1.temEstoque());
        System.out.println("O valor unitário do produto para entrada no estoque foi: " + tabuleiro1.getPrecoCompra());
        System.out.println("O valor para revenda do produto é: " + tabuleiro1.getPrecoRevenda(tabuleiro1.getPrecoCompra()));

        //Tabuleiro 2
        System.out.println("\n" + "Informações Brinquedo: " + tabuleiro2.getNome());
        System.out.println("Marca do produto: " + tabuleiro2.getMarca());
        System.out.println("Classificação Indicativa do produto :" + tabuleiro2.getClassificacaoIndicativa());
        System.out.println("Identificação do produto: " + tabuleiro2.getIdBrinquedo());
        System.out.println("Tem o produto no estoque?: " + tabuleiro2.temEstoque());
        System.out.println("O valor unitário do produto para entrada no estoque foi: " + tabuleiro2.getPrecoCompra());
        System.out.println("O valor para revenda do produto é: " + tabuleiro2.getPrecoRevenda(tabuleiro2.getPrecoCompra()));

        //Tabuleiro 3
        System.out.println("\n" + "Informações Brinquedo: " + tabuleiro3.getNome());
        System.out.println("Marca do produto: " + tabuleiro3.getMarca());
        System.out.println("Classificação Indicativa do produto :" + tabuleiro3.getClassificacaoIndicativa());
        System.out.println("Identificação do produto: " + tabuleiro3.getIdBrinquedo());
        System.out.println("Tem o produto no estoque?: " + tabuleiro3.temEstoque());
        System.out.println("O valor unitário do produto para entrada no estoque foi: " + tabuleiro3.getPrecoCompra());
        System.out.println("O valor para revenda do produto é: " + tabuleiro3.getPrecoRevenda(tabuleiro3.getPrecoCompra()));

        Carrinho carrinho1 = new Carrinho("Carro Tubarão", "Hotweels","2 anos", "Car-001", 3, 4.9);
        Carrinho carrinho2 = new Carrinho("Carro cobra", "Hotweels","2 anos", "Car-001", 3, 4.5);
        Carrinho carrinho3 = new Carrinho("Mc Queen", "Hotweels","2 anos", "Car-001", 3, 4.6);

        //Carrinho 1
        System.out.println("\n" + "Informações Brinquedo: " + carrinho1.getNome());
        System.out.println("Marca do produto: " + carrinho1.getMarca());
        System.out.println("Classificação Indicativa do produto :" + carrinho1.getClassificacaoIndicativa());
        System.out.println("Identificação do produto: " + carrinho1.getIdBrinquedo());
        System.out.println("Tem o produto no estoque?: " + carrinho1.temEstoque());
        System.out.println("O valor unitário do produto para entrada no estoque foi: " + carrinho1.getPrecoCompra());
        System.out.println("O valor para revenda do produto é: " + carrinho1.getPrecoRevenda(carrinho1.getPrecoCompra()));

        //Carrinho 2
        System.out.println("\n" + "Informações Brinquedo: " + carrinho2.getNome());
        System.out.println("Marca do produto: " + carrinho2.getMarca());
        System.out.println("Classificação Indicativa do produto :" + carrinho2.getClassificacaoIndicativa());
        System.out.println("Identificação do produto: " + carrinho2.getIdBrinquedo());
        System.out.println("Tem o produto no estoque?: " + carrinho2.temEstoque());
        System.out.println("O valor unitário do produto para entrada no estoque foi: " + carrinho2.getPrecoCompra());
        System.out.println("O valor para revenda do produto é: " + carrinho2.getPrecoRevenda(carrinho2.getPrecoCompra()));

        //Carrinho 3
        System.out.println("\n" + "Informações Brinquedo: " + carrinho3.getNome());
        System.out.println("Marca do produto: " + carrinho3.getMarca());
        System.out.println("Classificação Indicativa do produto:" + carrinho3.getClassificacaoIndicativa());
        System.out.println("Identificação do produto: " + carrinho3.getIdBrinquedo());
        System.out.println("Tem o produto no estoque?: " + carrinho3.temEstoque());
        System.out.println("O valor unitário do produto para entrada no estoque foi: " + carrinho3.getPrecoCompra());
        System.out.println("O valor para revenda do produto é: " + carrinho3.getPrecoRevenda(carrinho3.getPrecoCompra()));

        //Boneca
        Boneca boneca1 = new Boneca("Polly Pocket", "Mattel"," + 3 anos", "Bon-001", 5, 19);
        Boneca boneca2 = new Boneca("Little Dolls Passeio", "Diver Toys"," + 3 anos", "Bon-002", 5, 33);
        Boneca boneca3 = new Boneca("Moana", "Cotiplás"," + 3 anos", "Bon-003", 6, 137);

        //Boneca 1

        System.out.println("\n" + "Informações Brinquedo: " + boneca1.getNome());
        System.out.println("Marca do produto: " + boneca1.getMarca());
        System.out.println("Classificação Indicativa do produto :" + boneca1.getClassificacaoIndicativa());
        System.out.println("Identificação do produto: " + boneca1.getIdBrinquedo());
        System.out.println("Tem o produto no estoque?: " + boneca1.temEstoque());
        System.out.println("O valor unitário do produto para entrada no estoque foi: " + boneca1.getPrecoCompra());
        System.out.println("O valor para revenda do produto é: " + boneca1.getPrecoRevenda(boneca1.getPrecoCompra()));

        //Boneca 2
        System.out.println("\n" + "Informações Brinquedo: " + boneca2.getNome());
        System.out.println("Marca do produto: " + boneca2.getMarca());
        System.out.println("Classificação Indicativa do produto :" + boneca2.getClassificacaoIndicativa());
        System.out.println("Identificação do produto: " + boneca2.getIdBrinquedo());
        System.out.println("Tem o produto no estoque?: " + boneca2.temEstoque());
        System.out.println("O valor unitário do produto para entrada no estoque foi: " + boneca2.getPrecoCompra());
        System.out.println("O valor para revenda do produto é: " + boneca2.getPrecoRevenda(boneca2.getPrecoCompra()));

        //Boneca 3
        System.out.println("\n" + "Informações Brinquedo: " + boneca3.getNome());
        System.out.println("Marca do produto: " + boneca3.getMarca());
        System.out.println("Classificação Indicativa do produto :" + boneca3.getClassificacaoIndicativa());
        System.out.println("Identificação do produto: " + boneca3.getIdBrinquedo());
        System.out.println("Tem o produto no estoque?: " + boneca3.temEstoque());
        System.out.println("O valor unitário do produto para entrada no estoque foi: " + boneca3.getPrecoCompra());
        System.out.println("O valor para revenda do produto é: " + boneca3.getPrecoRevenda(boneca3.getPrecoCompra()));
    }
}