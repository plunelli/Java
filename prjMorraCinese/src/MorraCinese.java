import java.util.Random;
public class MorraCinese {

    private String giocatore1;
    private String giocatore2;

    public MorraCinese(String giocatore1, String giocatore2) {
        this.giocatore1 = giocatore1;
        this.giocatore2 = giocatore2;
    }

    public String gioca(String g1) {
        Random casuale = new Random();
        int nCasuale;
        String g2;
        String esito;
        String giocataV = "";
        String giocataP = "";
        String vincitore = "";
        nCasuale = casuale.nextInt(1, 4);
        if (nCasuale == 1) {
            g2 = "carta";
        } else {
            if (nCasuale == 2) {
                g2 = "forbici";
            } else {
                g2 = "sasso";
            }
        }
        if (g1 == g2) {
            esito = "Nessuno vince \n";

        } else {
            if (g1 == "carta" && g2 == "forbici" || g1 == "forbici" && g2 == "sasso" || g1 == "sasso" && g2 == "carta") {
                vincitore = giocatore2;
                giocataV = g2;
                giocataP = g1;
            } else {
                vincitore = giocatore1;
                giocataV = g1;
                giocataP = g2;
            }
            esito = vincitore + " vince, con " + giocataV + " contro " + giocataP + "\n";
        }

        return esito;
    }
}