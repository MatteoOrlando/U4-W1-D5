package part_1_player;

public class Immagine  extends ElementoMultimediale{

    //costruttore
    //public Immagine(String titolo, int durata) {
    //    super(titolo, durata);
    //}

    public Immagine(java.lang.String titolo, int durata) {
        super(titolo, durata);
    }

    //metodo play() implementato per l'immagine
    @Override
    public void play(){
        System.out.println("Riproduzione immagine: " + titolo);
    }
}
