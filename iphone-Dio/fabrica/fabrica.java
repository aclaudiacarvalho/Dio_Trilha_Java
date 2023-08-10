package fabrica;

import internet.navegadorInternet;
import telefone.telefoneIphone;
import musica.tocadorMusica;
import iphone.iphone;

public class fabrica {
    public static void main(String[] args) {
        iphone iphone = new iphone();


        tocadorMusica musica = iphone;
        telefoneIphone telefonico = iphone;
        navegadorInternet internet = iphone;


        System.out.println("musica.Musica");
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();
        System.out.println("*****************************************************");


        System.out.println("telefone.Telefone");
        telefonico.ligar();
        telefonico.atender();
        telefonico.iniciarCorreioVoz();


        System.out.println("******************************************************");
        System.out.println("internet.Internet");
        internet.pagina();
        internet.adicionandoNovaPagina();
        internet.atualizaPagina();
    }
}