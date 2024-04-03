// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrInt myArr=new ArrInt(10);

        myArr.add(3);
        myArr.add(4);
        myArr.add(5);
        myArr.add(3);
        myArr.add(6);
        myArr.add(7);
        System.out.printf(myArr.stampa());
        myArr.removeElement(3);
        System.out.printf(myArr.stampa());
        myArr.addElement(0,2);
        System.out.printf(myArr.stampa());
        }
    }
