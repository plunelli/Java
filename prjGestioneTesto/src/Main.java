// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


            Testo mytesto= new Testo("mAlE non fare paura non avere");
            Parola myparola = new Parola("prova");
            System.out.println("numero di parole: " + mytesto.conta_parole());
            System.out.println("numero di vocali: " + mytesto.conta_vocali());
            System.out.println("La parola invertita è " + myparola.inverti());
            Parola myparola2 = new Parola("anna");
            if (myparola2.ispalindroma()){
                System.out.println(myparola2.getWord() + " è palindroma");
            }
            else{
                System.out.println(myparola2.getWord() + " non è palindroma");
            }
            String[]parole = mytesto.separa_parole();
            for (String parola: parole){
                System.out.println(parola);
            }
            char[] lettere = mytesto.spelling();
            for (char lettera: lettere) {
                System.out.println(lettera);
            }
            System.out.println(mytesto.substr(2,5));

    } //end void main
} // end class Main

