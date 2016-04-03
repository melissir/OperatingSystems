/**
 * Created by Melissa Rhein on 3/19/2016.
 */
public class ThreadPrintChar extends Thread{

    private final String letter;
    private final CharPrinter printer;

    public ThreadPrintChar(String letter, CharPrinter printer){
        this.letter = letter;
        this.printer = printer;
    }


    public void run(){
        while(true) {
            printer.checkAndPrint(letter);
        }

    }



}
