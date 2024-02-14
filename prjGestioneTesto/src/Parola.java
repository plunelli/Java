public class Parola {
    private String word;

    public Parola(String p) {
        this.word = p;
    }
    public String getWord(){
        return this.word;
    }
    public void setWord(String p){
        this.word=p;
    }
    public String inverti(){
        int i;
        int lunghezza = this.word.length();
        int maxindex = this.word.length() - 1;
        String p="";
        for (i=0;i<lunghezza;i++){
            p=this.word.charAt(i)+p;
        }
        return p;
    }
    public boolean ispalindroma(){
        String p;
        boolean esito;
        p=inverti();
        if (p.equals(this.word)){
            esito = true;
        }
        else{
            esito = false;
        }
        return esito;
    }









} //end class
