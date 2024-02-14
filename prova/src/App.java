public class App {
    public static void main(String[] args) throws Exception {
        Lampadina myLampadina = new Lampadina("rosso", true, "duracell");
        System.out.println(myLampadina.stampa());
    }
}
