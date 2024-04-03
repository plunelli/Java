public class Studente {
    private String nome;
    private String cognome;
    private String password;
    private String nMatricola;
    private int annoNascita;

    public Studente(String nome, String cognome, int annoNascita, String nMatricola) {
        this.annoNascita = annoNascita;
        this.cognome = cognome;
        this.nMatricola = nMatricola;
        this.nome = nome;
        this.password = "";
        creaPass();
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getPassword() {
        return password;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public String getnMatricola() {
        return nMatricola;
    }

    public String stampa() {
        String testo = "Nome: " + nome + "\nCognome: " + cognome + "\nPassword: " + password + "\nnMatricola: " + nMatricola + "\nAnno di nascita: " + annoNascita;
        return testo;
    }

    private void creaPass() {
        password += cognome.toUpperCase().charAt(0);
        password += cognome.toLowerCase().charAt(cognome.length() - 1);
        int lunghezzaTotale= nome.length()+cognome.length();
        password+= cifra(lunghezzaTotale);
        password += nome.toUpperCase().charAt(0);
        password += nome.toLowerCase().charAt(nome.length()-1);
        password += contaVocali(nome)+contaVocali(cognome);
        Numero n = new Numero("10",10);
    }




    private String cifra(int num){
        String let="";
        switch (num){
            case 10:
                let ="A";
                break;
            case 11:
                let ="B";
                break;
            case 12:
                let ="C";
                break;
            case 13:
                let ="D";
                break;
            case 14:
                let ="E";
                break;
            case 15:
                let ="F";
                break;
            default: let+=num;
        }
        return let;
    }




    private int contaVocali(String str) {
        int contatore = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contatore++;
            }
        }
        return contatore;
    }

}






