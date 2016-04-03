/**
 * Created by Melissa Rhein on 3/19/2016.
 */
public class StepTwoThread extends Thread{
    private int[] baseArray;
    private String[] args;
    private int i;
    private int j;

    public StepTwoThread(int[] baseArray, String[] args, int i, int j){
        this.baseArray = baseArray;
        this.args = args;
        this.i = i;
        this.j = j;
    }

    public void run(){
        String message = "Thread T(" + i + "," + j + ") compares x[" + i + "] = " + args[i] +
                " and x[" + j + "] = " + args[j] + ", and writes 0 into ";
        if(Integer.parseInt(args[i]) < Integer.parseInt(args[j])){
            baseArray[i] = 0;
            message += "w[" + i + "]";
        }else{
            baseArray[j] = 0;
            message += "w[" + j + "]";
        }
        System.out.println(message);
    }
}
