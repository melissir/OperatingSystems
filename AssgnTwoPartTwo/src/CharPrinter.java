/**
 * Created by Melissa Rhein on 3/19/2016.
 */
public class CharPrinter {

    private static String activeName;
    private static final String[] names = new String[]{"a", "b", "c"};


    public CharPrinter(){
        activeName = "a";
    }

    public static String getActiveName() {
        return activeName;
    }

    public static void setActiveName(String activeName) {
        CharPrinter.activeName = activeName;
    }

    public synchronized void checkAndPrint(String letterToPrint) {
        try {
            int indexNum = 0;
            for (int i = 0; i < names.length; i++) {
                if (letterToPrint.equals(names[i])) {
                    indexNum = i;
                    break;
                }
            }
            if (activeName.equals(letterToPrint)) {
                System.out.print(letterToPrint);
                activeName = names[((indexNum + 1) % 3)];
                notifyAll();
            } else {
                wait();
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
