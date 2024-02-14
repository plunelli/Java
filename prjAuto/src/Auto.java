public class Auto {
    private String targa;
    private double kmPercorsi;
    private int annoImmatricolazione;
    private double prezzoBase;
    private String proprietario;

    public Auto (String targa,double kmPercorsi, int annoImmatricolazione, double prezzoBase, String proprietario){
        this.targa = targa;
        this.kmPercorsi=kmPercorsi;
        this.annoImmatricolazione=annoImmatricolazione;
        this.prezzoBase=prezzoBase;
        this.proprietario=proprietario;
    }
    public String getTarga(){
        return targa;
    }
    public double getKmPercorsi(){
        return kmPercorsi;
    }
    public int getAnnoImmatricolazione(){
        return annoImmatricolazione;
    }

    public double getPrezzoBase(){
        return  prezzoBase;
    }

    public String getProprietario(){
        return proprietario;
    }
    public String stampaAttributi(){
        String attributi;
        attributi = "Targa: " + targa + "\n"+
                    "Km Percorsi: " + kmPercorsi + "\n" +
                     "Anno Imm.: " + kmPercorsi + "\n" +
                    "Prezzo: " + kmPercorsi + "\n" +
                    "Proprietario.: " + kmPercorsi + "\n";
        return attributi;
    }
    public void setProprietario(String p){
        proprietario = p;
    }
    public void aggiungiKmPercorsi(double km){
        kmPercorsi=kmPercorsi+km;
    }
    public double calcolaPrezzoCorrente(int anno){
        int esponente;
        double valoreCorrente;
        esponente = anno - annoImmatricolazione;
        valoreCorrente = prezzoBase * Math.pow(0.8,(double) esponente);
        return valoreCorrente;
    }
}
