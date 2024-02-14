import javax.swing.plaf.PanelUI;

public class Testo {
    private String frase;
    public Testo (String frase){

        this.frase=frase;
    }
    public String getFrase(){
        return this.frase;
    }
    public void setFrase(String f){
        this.frase = f;
    }

    public int conta_parole(){
        String[] parole;
       parole = frase.split(" ");
       return parole.length;
    }
    public int conta_vocali(){
        char lettera;
        String f;
        int numero;
        int contatore = 0;
        f=frase.toLowerCase();
        for (int i=0;i<frase.length();i++){
            lettera = f.charAt(i);
            numero = (int)(f.charAt(i));
            switch (lettera){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contatore++;
            }
        }
        return contatore;
    }
    public String[] separa_parole(){
        return frase.split(" ");
    }
    public char[] spelling(){
        char[] lettere;
        lettere = new char[frase.length()];
        for (int i=0;i<frase.length();i++){
            lettere[i] = frase.charAt(i);
        }
        return lettere;
    }

    public String substr(int inizio,int fine){
        int i;
        String ss="";
        int lunghezza = this.frase.length();
        int maxindex = this.frase.length() - 1;
        for(i=inizio-1;i<fine;i++){
            ss+=frase.charAt(i);
        }
        return ss;
    }

} //end class
