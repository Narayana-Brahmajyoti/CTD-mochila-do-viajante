public class Publico extends Paciente implements Comparable{
    private int cardSus;

    public Publico(String dataNasc, String nome, String sobrenome, boolean primConsulta, Consulta consulta, int cardSus)
    {
        super(dataNasc, nome, sobrenome, primConsulta, consulta);
        this.cardSus = cardSus;
    }

    @Override
    public int compareTo(Object object) {
        Publico aux = (Publico) object;

        if(aux.cardSus == this.cardSus)
            return 0;
        else if(aux.cardSus > this.cardSus)
            return 1;
        else
            return -1;
    }
}
