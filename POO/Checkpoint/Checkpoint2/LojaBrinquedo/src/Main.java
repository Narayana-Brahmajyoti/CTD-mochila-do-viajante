package lojabrinquedo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estoque estoque = new Estoque();
        boolean continuarLooping = true;
        while (continuarLooping) {

            System.out.println("---------Escolha uma das opções abaixo---------");
            System.out.println("|   Opção 1 - Cadastrar brinquedos            |");
            System.out.println("|   Opção 2 - Mostrar brinquedos cadastrados  |");
            System.out.println("|   Opção 3 - Sair do programa                |");
            System.out.println("-----------------------------------------------");

            int operacao = entrada.nextInt();

            switch (operacao) {

                case 1:

                    System.out.println("--Qual brinquedo você gostaria de cadastrar no sistema?--");
                    System.out.println("              |   Opção 1 - Boneca        |              ");
                    System.out.println("              |   Opção 2 - Carrinho      |              ");
                    System.out.println("              |   Opção 3 - Tabuleiro     |              ");
                    System.out.println("-----------------------==================----------------");

                    System.out.println("Digite aqui sua opção: ");
                    int opcao = entrada.nextInt();
                    break;

                    switch (opcao) {
                        case 1:

                            System.out.println("Digite o nome da boneca: ");
                            String nomeBoneca = entrada.next();
                            System.out.println("Digite o Id da boneca: ");
                            String idBoneca = entrada.next();
                            System.out.println("Digite a marca da boneca: ");
                            String marcaBoneca = entrada.next();
                            System.out.println("Digite a classificação indicativa da boneca: ");
                            String classIndicativaBoneca = entrada.next();
                            Boneca boneca = new Boneca(nomeBoneca, idBoneca, marcaBoneca, classIndicativaBoneca);
                            estoque.addBrinquedo(boneca);
                            break;
                        case 2:

                            System.out.println("Digite o nome do carrinho: ");
                            String nomeCarrinho = entrada.next();
                            System.out.println("Digite o Id do carrinho: ");
                            String IdCarrinho = entrada.next();
                            System.out.println("Digite a marca da carrinho: ");
                            String marcaCarrinho = entrada.next();
                            System.out.println("Digite a classificação indicativa da carrinho: ");
                            String classIndicativaCarrinho = entrada.next();
                            Carrinho carrinho = new Carrinho(nomeCarrinho, IdCarrinho, marcaCarrinho, classIndicativaCarrinho);
                            estoque.addBrinquedo(carrinho);
                            break;

                        case 3:

                            System.out.println("Digite o nome do tabuleiro: ");
                            String nomeTabuleiro = entrada.next();
                            System.out.println("Digite o Id do tabuleiro: ");
                            String idTabuleiro = entrada.next();
                            System.out.println("Digite a marca da tabuleiro: ");
                            String marcaTabuleiro = entrada.next();
                            System.out.println("Digite a classificação indicativa da tabuleiro: ");
                            String classIndicativaTabuleiro = entrada.next();
                            Tabuleiro tabuleiro = new Tabuleiro(nomeTabuleiro, idTabuleiro, marcaTabuleiro, classIndicativaTabuleiro);
                            estoque.addBrinquedo(tabuleiro);
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + opcao);
                            throw new NullPointerException("Os Campos não podem ser nulos");
                    }

                case 2:
                    estoque.mostrarLista();
                    break;
                case 3:
                    continuarLooping = false;
                    break;

            }

        }
    }
}





/*





        Tabuleiro tabuleiro1 = new Tabuleiro("Cara a cara", "Estrela", "6 anos", "Tab-001", 3,75.0);
        Tabuleiro tabuleiro2 = new Tabuleiro("Xadrez", "Big Boy", "6 anos", "Tab-002", 7,18.5);
        Tabuleiro tabuleiro3 = new Tabuleiro("Roleta Cassino", "Nig Brinquedos", "8 anos", "Tab-003", 4,37.1);
        Tabuleiro tabuleiro4 = new Tabuleiro("Dama", "Estrela","6 anos","Tab-004", 3, 15.0);

        ////Imprimindo informações dos jogos de tabuleiros
        System.out.println(tabuleiro1.imprimirInfosComuns());
        System.out.println(tabuleiro2.imprimirInfosComuns());
        System.out.println(tabuleiro3.imprimirInfosComuns());
        System.out.println(tabuleiro4.imprimirInfosComuns());

        Carrinho carrinho1 = new Carrinho("Carro Tubarão", "Hotweels","2 anos", "Car-001", 3, 4.9);
        Carrinho carrinho2 = new Carrinho("Carro cobra", "Hotweels","2 anos", "Car-001", 3, 4.5);
        Carrinho carrinho3 = new Carrinho("Mc Queen", "Hotweels","2 anos", "Car-001", 3, 4.6);

        //Imprimindo informações dos carrinhos
        System.out.println(carrinho1.imprimirInfosComuns());
        System.out.println(carrinho2.imprimirInfosComuns());
        System.out.println(carrinho3.imprimirInfosComuns());

        //Boneca
        Boneca boneca1 = new Boneca("Polly Pocket", "Mattel"," + 3 anos", "Bon-001", 5, 19);
        Boneca boneca2 = new Boneca("Little Dolls Passeio", "Diver Toys"," + 3 anos", "Bon-002", 5, 33);
        Boneca boneca3 = new Boneca("Moana", "Cotiplás"," + 3 anos", "Bon-003", 6, 137);

        //Imprimindo informações das Bonecas

        System.out.println(boneca1.imprimirInfosComuns());
        System.out.println(boneca2.imprimirInfosComuns());
        System.out.println(boneca3.imprimirInfosComuns());
    */


