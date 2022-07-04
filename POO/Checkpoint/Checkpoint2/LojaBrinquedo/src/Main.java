package lojabrinquedo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        dadosBrinquedos();
    }
    public static void dadosBrinquedos(){
        Scanner sc =  new Scanner(System.in);
        Brinquedo brinquedo;
        List<Brinquedo> listaBrinquedos = new ArrayList<Brinquedo>();
        int opcao = 0;

        do {
            System.out.println("-----Escolha uma das opções abaixo-----");
            System.out.println("Opção 1 - Cadastrar brinquedos");
            System.out.println("Opção 2 - Mostrar brinquedos cadastrados");
            System.out.println("Opção 3 - Sair do programa");
            System.out.println("---------------------------------------");

            System.out.println("Digite aqui sua opçãp: ");
            opcao = Integer.parseInt(sc.nextLine());

            if(opcao == 1){
                //Cria um novo objeto
                System.out.println("--Qual brinquedo você gostaria de cadastrar no sistema?--");
                System.out.println("Opção 1 - Boneca");
                System.out.println("Opção 2 - Carrinho");
                System.out.println("Opção 3 - Tabuleiro");
                System.out.println("---------------------------------------");

                System.out.println("Digite aqui sua opçãp: ");
                int opcao1 = Integer.parseInt(sc.nextLine());

                switch (opcao1){
                    case 1:
                        Boneca setTipoBrinquedo1 = new Boneca();
                        System.out.println("Digite o nome do brinquedo: ");
                        String nome = sc.nextLine();
                        System.out.println("Digite a marca do brinquedo: ");
                        String marca = sc.nextLine();
                        System.out.println("Digite a classificação indicativa do brinquedo: ");
                        String classificacaoIndicativa = sc.nextLine();
                        System.out.println("Digite o Id do brinquedo: ");
                        String idBrinquedo = sc.nextLine();
                        System.out.println("Digite quantidade de brinquedos para dar entrada no estoque: ");
                        String setQuantidade = sc.nextLine();
                        System.out.println("Digite o valor unitário do produto: ");
                        String precoCompra = sc.nextLine();
                        break;
                    case 2:
                        Carrinho setTipoBrinquedo2 = new Carrinho();
                        System.out.println("Digite o nome do brinquedo: ");
                        String setNome = sc.nextLine();
                        System.out.println("Digite a marca do brinquedo: ");
                        String setMarca = sc.nextLine();
                        System.out.println("Digite a classificação indicativa do brinquedo: ");
                        String setClassificacaoIndicativa = sc.nextLine();
                        System.out.println("Digite o Id do brinquedo: ");
                        String setIdBrinquedo = sc.nextLine();
                        System.out.println("Digite quantidade de brinquedos para dar entrada no estoque: ");
                        String setQuantidade = sc.nextLine();
                        System.out.println("Digite o valor unitário do produto: ");
                        String setPrecoCompra = sc.nextLine();
                        break;
                    case 3:
                        Tabuleiro getTipoBrinquedo3 = new Tabuleiro
                        System.out.println("Digite o nome do brinquedo: ");
                        String setNome = sc.nextLine();
                        System.out.println("Digite a marca do brinquedo: ");
                        String setMarca = sc.nextLine();
                        System.out.println("Digite a classificação indicativa do brinquedo: ");
                        String setClassificacaoIndicativa = sc.nextLine();
                        System.out.println("Digite o Id do brinquedo: ");
                        String setIdBrinquedo = sc.nextLine();
                        System.out.println("Digite quantidade de brinquedos para dar entrada no estoque: ");
                        String setQuantidade = sc.nextLine();
                        System.out.println("Digite o valor unitário do produto: ");
                        String setPrecoCompra = sc.nextLine();
                        break;
                }
                //Guarda o objeto brinquedo em uma lista.
                listaBrinquedos.add(listaBrinquedos);
                }else if(opcao == 2){
                    if(listaBrinquedos.isEmpty()){
                    System.out.println("Não existem pessoas cadatradas, pressione uma tecla para continuar!");
                    sc.nextLine();
                }else{
                    System.out.println(listaBrinquedos.toString());

                    System.out.println("Pressione um tecla para continuar.");
                    sc.nextLine();
                }
        } while (opcao != 0);
        sc.close();
                
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
    }
}