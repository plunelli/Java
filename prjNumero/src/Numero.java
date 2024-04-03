public class Numero {
    private String valore;
    private int base;


    public Numero(String valore, int base) {
        this.valore = valore;
        this.base = base;
    }

    public int numindecimale(){
        int totale = 0;
        int esponente = valore.length()-1;
        if (base != 10) {
            for (int i = 0;i<valore.length(); i++) {
                totale += cifra(valore.charAt(i)) * Math.pow(base, esponente);
                esponente--;

            }
        }
        return totale;
    }


    public int numDecContrario() {
        int totale = 0;

        for (int pos = valore.length() - 1; pos >= 0; pos--) {
            if (valore.charAt(pos) == '1') {
                totale += Math.pow(2, valore.length() - 1 - pos);
            }
        }

        return totale;
    }


    public String esadecimale(){
        String t = " è il numero in esadecimale";
        int lung = valore.length()-1;
        int numCaratteri = lung;
        char lettera;
        int numArrivo = 4;
        int c = 0;

        while(lung>=0){
            int somma = 0;
            int elevazione = 0;
            while(c<numArrivo){
                if(numCaratteri>=0){
                    int carattere = valore.charAt(numCaratteri);
                    somma = somma+((carattere-'0')*(int)Math.pow(2,elevazione));
                }
                elevazione++;
                numCaratteri--;
                c++;
            }
            if (somma<10){
                t = somma + t;
            }else{
                switch (somma){
                    case 10 :
                        lettera = 'A';
                        t = lettera + t;
                        break;
                    case 11 :
                        lettera = 'B';
                        t = lettera + t;
                        break;
                    case 12 :
                        lettera = 'C';
                        t = lettera + t;
                        break;
                    case 13 :
                        lettera = 'D';
                        t = lettera + t;
                        break;
                    case 14 :
                        lettera = 'E';
                        t = lettera + t;
                        break;
                    case 15 :
                        lettera = 'F';
                        t = lettera + t;
                        break;

                    default :
                        t = "impossibile";
                }

            }
            lung = lung-4;
            numArrivo = numArrivo+4;
        }
        return t;
    }

    private int cifra(char val){
        int deca = 0;
        if ( val <= '9'){
            deca = Character.getNumericValue(val);
        } else {
            if (val >= 'A' && val <= 'F'){
                deca = val - 'A' + 10;
            }
        }
        return deca;
    }


    public String getValore() {
        return valore;
    }

    public int getBase() {
        return base;
    }

    public String stampa() {
        String t = "Il numero in binario è : "+valore +"\nLa base risulta : "+base;
        return t;
    }
}
