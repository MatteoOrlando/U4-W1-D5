package part_1_player;

public  class Video extends ElementoMultimediale {

    //costruttore
    //public Video (String titolo, int durata) {
    //    super(titolo, durata);
    //}

    public Video(java.lang.String titolo, int durata) {
        super(titolo, durata);
    }

    @Override
    public void play(){
        System.out.println("Riproduzione video: " + titolo);
    }
}
