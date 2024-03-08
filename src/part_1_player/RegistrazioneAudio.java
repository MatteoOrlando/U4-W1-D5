package part_1_player;

public class RegistrazioneAudio extends ElementoMultimediale{
    private int volume;

   // public RegistrazioneAudio(String titolo, int durata, int volume) {
     //   super(titolo, durata);
      //  this.volume = volume;
  //  }

    public RegistrazioneAudio(java.lang.String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    //metodo play() implementato
    @Override public void play(){
        for( int i = 0; i < durata; i++){

            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }
}
