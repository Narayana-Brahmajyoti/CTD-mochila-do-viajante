public class Particular extends Paciente{
    private double valorConsulta;
    private String rg;

    public Particular(String dataNasc, String nome, String sobrenome, boolean primConsulta, Consulta consulta, double valorConsulta){
        super(dataNasc, nome, sobrenome, primConsulta, consulta);
        this.valorConsulta = valorConsulta;
        this.rg = rg;


    }
}
