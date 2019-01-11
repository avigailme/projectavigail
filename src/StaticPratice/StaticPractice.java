package StaticPratice;

public class StaticPractice {

   private static int numOfCalls;

    public static int increment(){
        return ++numOfCalls;

    }


    public static int factorial(){
        int sum = 1;

        if (numOfCalls==0) {
            return 0;

        }
            for (int i = 1; i < numOfCalls; i++) {
                sum = sum * i;
            }
            return sum;

    }
    public static int getNumOfCalls() {
        return numOfCalls;
    }

    public static void setNumOfCalls(int numOfCalls) {
        StaticPractice.numOfCalls = numOfCalls;
    }
}
