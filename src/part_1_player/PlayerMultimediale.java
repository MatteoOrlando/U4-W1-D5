package part_1_player;
import java.util.ArrayList;
import java.util.List;

public class PlayerMultimediale {
    protected List<ElementoMultimediale> playlist;

    // Costruttore
    public PlayerMultimediale() {
        this.playlist = new ArrayList<>();
    }

    // Metodo
    public void aggiungiElemento(ElementoMultimediale elemento) {
        playlist.add(elemento);
    }

    // Metodo per riprodurre tutti gli elemnti
    public void riproduci() {
        for (ElementoMultimediale elemento : playlist) {
            elemento.play();
            System.out.println("Titolo: " + elemento.getTitolo());
            System.out.println("Durata: " + elemento.getDurata());
        }
    }
}
