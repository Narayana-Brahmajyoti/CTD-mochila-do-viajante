public class Main {
    public static void main(String[] args) {
        GradeDeFilmesProxy proxy = new GradeDeFilmesProxy(new GradeDeFilmes());
        proxy.setIp(new Ip(100, 23, 23, 25));

        try {
            System.out.println(proxy.getFilme("The White Tiger").getLink());
            System.out.println("Acesso Liberado");
        } catch (FilmeNaoHabilitadoException e) {
            System.out.println(e);
        }


        SerieProxy s = new SerieProxy(new SerieGrade());

        try {
            s.getSerie("Game Of Thrones");
            s.getSerie("Friends");
            s.getSerie("How i meet your Mother");
            s.getSerie("The Boys");
            s.getSerie("Grey´s Anatomy");
            s.getSerie("The Office");
        } catch (SerieNaoHabilitadaException myException) {
            System.out.println(myException.getMessage());
        }
    }
}
