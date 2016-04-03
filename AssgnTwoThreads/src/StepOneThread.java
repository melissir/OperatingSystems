/**
 * Created by Melissa Rhein on 3/19/2016.
 */
public class StepOneThread extends Thread{

    private int index;
    private int[] baseArray;

    public StepOneThread(int[] baseArray, int index){
        this.baseArray = baseArray;
        this.index = index;
    }

    public void run(){
        baseArray[index] = 1;
    }
}
