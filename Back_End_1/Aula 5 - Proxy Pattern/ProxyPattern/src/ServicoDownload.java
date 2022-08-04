public class ServicoDownload implements Download{

    @Override
    public void baixarMusica(Usuario usuario) {
        System.out.println("O usuário " + usuario.getId() + " tem permissão para fazer o download.");
    }
}
