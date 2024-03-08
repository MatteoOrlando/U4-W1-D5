import part_1_player.Immagine;
import part_1_player.PlayerMultimediale;
import part_1_player.RegistrazioneAudio;
import part_1_player.Video;

public class Main {
    public static void main(String[] args) {

        //istanza del player multimediale
        PlayerMultimediale player = new PlayerMultimediale();

        //aggiungo elemetni alla playlist

        player.aggiungiElemento(new Immagine("Immagine1", 3));
        player.aggiungiElemento(new Video("Video1", 7));
        player.aggiungiElemento(new RegistrazioneAudio("Audio1", 3, 7));
        }
    }
