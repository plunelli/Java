
public class Lampadina {
    private String colore;
    private String marca;
    private Boolean stato;

    public Lampadina(String c, boolean s, String m) {
        colore = c;
        marca = m;
        stato = s;
    }

    public String stampa() {
        String testo = "marca " + marca + " colore " + colore + " stato " + stato;
        return testo;
    }
}
