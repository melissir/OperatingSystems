/**
 * Created by Melissa Rhein on 3/19/2016.
 */
public class Main {
    public static void main(String[] args) {

        CharPrinter printer = new CharPrinter();

        ThreadPrintChar threadA = new ThreadPrintChar("a", printer);
        ThreadPrintChar threadB = new ThreadPrintChar("b", printer);
        ThreadPrintChar threadC = new ThreadPrintChar("c", printer);

        threadC.start();
        threadA.start();
        threadB.start();
    }

}
