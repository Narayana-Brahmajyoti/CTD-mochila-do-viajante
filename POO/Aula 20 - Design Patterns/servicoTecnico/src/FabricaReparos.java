public class FabricaReparos implements Criador{

    @Override
    public Reparo criarReparo(String nome, String endereco) {
        return new Reparo(nome,endereco);
    }
}
