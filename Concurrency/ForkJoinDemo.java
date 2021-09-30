import java.util.concurrent.*;
import java.util.*;

class SqrtTransform extends RecursiveAction{
    final int seqThreshhold = 1000;
    double[] data;
    int start, end;

    SqrtTransform(double[] vals, int s, int e){
        data = vals;
        start = s;
        end = e;
    }

    public void compute(){
        if ((end - start) <  seqThreshhold){
            for (int i=start; i<end; i++){
                data[i] = Math.sqrt(data[i]);
            }
        }
        else {
            int middle = (start + end) / 2;
            invokeAll(new SqrtTransform(data, start, middle),
                    new SqrtTransform(data, middle, end));
        }
    }
}

class ForkJoinDemo{
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[100000];

        for (int i=0; i<nums.length; i++){
            nums[i] = (double)i;
        }
        System.out.println("A portion of the original sequence");

        for (int i=0; i<10; i++){
            System.out.println(nums[i] + " ");
        }
        System.out.println();

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

        fjp.invoke(task);
        System.out.println("A portion of the transformed sequence" + " (to four decimal places):");

        for (int i=0; i<10; i++){
            System.out.format("%.4f", nums[i]);
        }
        System.out.println();
    }
}