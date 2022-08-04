package lojabrinquedo;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private int quantidade;
    private double precoCompra;
    private List<Brinquedo> listaBrinquedo = new ArrayList<Brinquedo>();



    public void addBrinquedo(Brinquedo brinquedo){
        this.listaBrinquedo.add(brinquedo);
    }
    public void mostrarLista(){
        for(Brinquedo brinquedo : listaBrinquedo){
            System.out.println(brinquedo.toString());
        }
    }
/*
    //Pega o valor que está entrando e soma com a quantidade
    public int entradaEstoque(int valor){
        return this.quantidade += valor;

    }
    public int saidaEstoque(int valor){
        return this.quantidade -= valor;

    }
    //cria os getters
    public int getQuantidade(){
        return this.quantidade; //this referencia o atributo da sua classe

    }

    public double getPrecoCompra() {
        return this.precoCompra;
    }
*/
    public List<Brinquedo> getListaBrinquedo() {
        return listaBrinquedo;
    }

    public void setListaBrinquedo(List<Brinquedo> listaBrinquedo) {
        this.listaBrinquedo = listaBrinquedo;
    }
}
