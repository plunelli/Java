import  java.lang.Math;
public class Calcolo {

    private double a;

    private double b;

    public Calcolo(double a, double b) {
        this.a=a;
        this.b=b;
    }

    public double calcola (String operatore) {
        double risultato=0;
        switch (operatore) {
            case "+":
                risultato = a + b;
                break;
            case "-":
                risultato = a - b;
                break;
            case "*":
                risultato = a * b;
                break;
            case "/":
                if (b != 0) {
                    risultato = a / b;
                } else {
                    risultato = 0;
                }
                break;
            case "^":
                risultato = Math.pow(a, b);
                break;
            /*default:
                risultato = 0;*/
        }
            return risultato;
        }

    }


