public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Alô!!");
    }

    @Override
    public void iniciarConversaVoz() {
        System.out.println("Iniciando Conversa de Voz.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba!!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada!");
    }

    @Override
    public void tocar() {
        System.out.println("Play!!");
    }

    @Override
    public void pausar() {
        System.out.println("Pause!!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música.");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atenderChamada();
        iphone.iniciarConversaVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}
