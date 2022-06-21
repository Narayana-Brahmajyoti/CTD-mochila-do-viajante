public abstract class Paciente {
    private String dataNasc;
    private String nome;
    private String sobrenome;
    private boolean primConsulta;
    private Consulta consulta;

    public Paciente(String dataNasc, String nome, String sobrenome, boolean primConsulta, Consulta consulta){
        this.dataNasc = dataNasc;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.primConsulta = primConsulta;
        this.consulta = consulta;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public boolean avaliacaoInicial(){
        if(this.primConsulta) {
            System.out.println("O paciente passara pela avaliaçâo inicial.");
            return true;

        }
        System.out.println("O paciente não precisa passar pela avaliçâo inicial.");
        return false;
    }


}
