public class ServicoDownload implements Download{

    @Override
    public void baixarMusica(Usuario usuario, String nomeMusica) {
        System.out.println("O usuário " + usuario.getId() + " - " + usuario.getTipoUsuario() + ": fazendo download da música " + nomeMusica + ".");
    }



}
