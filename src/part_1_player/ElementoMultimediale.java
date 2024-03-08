package part_1_player;

public abstract class ElementoMultimediale {

    //titolo contenuto
    public String titolo;

    //durata contenuto espressa in secondi
    public int durata;


    //creo il costruttore padre che assegnerá i parametri ai child
    public ElementoMultimediale(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

    //metodo abstract per la riproduzione del contenuto
    public abstract void play();

    // Metodo per ottenere la durata e titolo
    public int getDurata() {
        return durata;
    }
    protected String  getTitolo() {
        return titolo;
    }
}