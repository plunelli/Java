// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Invio with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Auto a;
        a=new Auto("fm8756l",500.00,2023,12000.00,"Rossi");
        System.out.printf(a.stampaAttributi());
        double CurrentPrice = a.calcolaPrezzoCorrente(2023);
        System.out.printf(Double.toString(CurrentPrice));
        // Press Maiusc+F10 or click the green arrow button in the gutter to run the code.
       // Press Maiusc+F9 to start debugging your code. We have set one breakpoint
       // for you, but you can always add more by pressing Ctrl+F8.

        }
    }
