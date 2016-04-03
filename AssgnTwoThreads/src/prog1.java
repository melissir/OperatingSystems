import java.util.Arrays;

/**
 * Created by Melissa Rhein on 3/19/2016.
 */
public class prog1 {
    public static void main(String[] args){
        try {
            //Step One
            int[] baseArray = new int[args.length - 1];
            int n = Integer.parseInt(args[0]);
            String[] inputValues = Arrays.copyOfRange(args, 1, args.length);

            //output
            System.out.println("Number of input values = " + n);
            String message = "Input values     x = ";
            for (String s: inputValues){
                message += s + " ";
            }
            System.out.println(message);

            //thread work
            StepOneThread[] threadOneArray = new StepOneThread[n];

            for (int i = 0; i < n; i++) {
                threadOneArray[i] = new StepOneThread(baseArray, i);
                threadOneArray[i].start();
            }
            for (StepOneThread j : threadOneArray) {
                j.join();
            }

            //output
            message = "After initialization w = ";
            for (int wInt:baseArray ){
                message += wInt;
            }
            System.out.println(message);
            System.out.println(".................................");

            //Step Two
            StepTwoThread[][] threadTwoArray = new StepTwoThread[n][n];

            for (int i = 0; i < n; i++) {
                for(int j = i+1; j < n; j++) {
                    threadTwoArray[i][j] = new StepTwoThread(baseArray, inputValues, i, j);
                    threadTwoArray[i][j].start();
                }
            }
            for (int i = 0; i < n; i++) {
                for(int j = i+1; j < n; j++) {
                    threadTwoArray[i][j].join();
                }
            }

            //output
            System.out.println(".................................");
            message = "After step 2      w = ";
            for (int wInt:baseArray ){
                message += wInt;
            }
            System.out.println(message);

            //Step 3
            StepThreeThread[] threadThreeArray = new StepThreeThread[n];

            for (int i = 0; i < n; i++) {
                threadThreeArray[i] = new StepThreeThread(baseArray, inputValues, i);
                threadThreeArray[i].start();
            }
            for (StepThreeThread j : threadThreeArray) {
                j.join();
            }


        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
