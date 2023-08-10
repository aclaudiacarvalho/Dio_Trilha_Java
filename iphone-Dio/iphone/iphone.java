package iphone;

import internet.navegadorInternet;
import musica.tocadorMusica;
import telefone.telefoneIphone;

public class iphone implements tocadorMusica, navegadorInternet, telefoneIphone {
    @Override
    public void tocar() {
        System.out.println("Tocando musica via equipamento iphone.Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pause na musica via equipamento iphone.Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica via equipamento iphone.Iphone");
    }


    public void pagina() {
        System.out.println("Abrindo a pagina via equipamento iphone.Iphone");
    }

    @Override
    public void adicionandoNovaPagina() {
        System.out.println("Adicionando nova pagina via equipamento iphone.Iphone");
    }

    @Override
    public void atualizaPagina() {
        System.out.println("Atualizando a pagina via equipamento iphone.Iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Ligar via equipamento iphone.Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atender via equipamento iphone.Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz via equipamento iphone.Iphone");
    }
}