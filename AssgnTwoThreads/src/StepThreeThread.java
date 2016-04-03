/**
 * Created by Melissa Rhein on 3/19/2016.
 */
public class StepThreeThread extends Thread{

    private int[] baseArray;
    private String[] args;
    private int i;

    public StepThreeThread(int[] baseArray, String[] args, int i){
        this.baseArray = baseArray;
        this.args = args;
        this.i = i;
    }

    public void run(){
        if(baseArray[i] == 1){
            System.out.print("Maximum = "+ args[i] +"\nLocation = " + i);
        }
    }
}
