package musica;

public class musica implements tocadorMusica {
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pause");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar musica");
    }
}