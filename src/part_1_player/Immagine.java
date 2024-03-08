package part_1_player;

public class Immagine  extends ElementoMultimediale{

    //costruttore
    public Immagine(String titolo, int durata) {
        super(titolo, durata);
    }

    //metodo play() implementato per l'immagine
    @Override
    public void play(){
        System.out.printIn("Riproduzione immagine: " + titolo);
    }
}
