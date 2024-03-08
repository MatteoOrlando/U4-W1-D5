package part_1_player;

public  class Video extends ElementoMultimediale {

    //costruttore
    public Video(String titolo, int durata) {

        //ereditarietá dei parametri
        super(titolo, durata);
    }

    @Override
    public void play(){
        System.out.printIn("Riproduzione video: " + titolo);
    }
}
