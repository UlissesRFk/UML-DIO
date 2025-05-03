import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{

    public void Ligar(String numero) {
        System.out.println("\nLigação iniciada para o numero: " + numero);
    }

    public void IniciarCorreioVoz() {
        System.out.println("\nLigação iniciada");
    }

    public void Atender() {
        System.out.println("\nAtendido!");
    }

    public void ExibirPagina(String url) {
        System.out.println("\nExibição da pagina: " + url);
    }

    public void AdicionarNovaAba() {
        System.out.println("\nNova aba adicinada");
    }

    public void AtualizarPagina() {
        System.out.println("\nPagina atualizada\n");
    }

    public void Tocar() {
        System.out.println("\nTocando a musica!");
    }

    public void SelecionarMusica(String musica) {
        System.out.println("\nA musica selecionada foi: " + musica);
    }

    public void Pausar() {
        System.out.println("\nA musica foi pausada\n");
    }

}
