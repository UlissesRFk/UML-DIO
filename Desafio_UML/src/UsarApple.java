public class UsarApple {
    public static void main(String[] args) {
        Iphone AppleX = new Iphone();

            System.out.println("================================");
            AppleX.Ligar("89900023");
            AppleX.IniciarCorreioVoz();
            AppleX.Atender();

            System.out.println("================================");
            AppleX.Tocar();
            AppleX.SelecionarMusica("Poesia acustisca 3");
            AppleX.Pausar();

            System.out.println("================================");
            AppleX.ExibirPagina("https://www.youtube.com/watch?v=QD4Iv-qV0iA");
            AppleX.AdicionarNovaAba();
            AppleX.AtualizarPagina();
    }
}
