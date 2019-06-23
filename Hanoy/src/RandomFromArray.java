import java.util.Arrays;

public class RandomFromArray {
    private int[] values;
    private int[] weights;
    private int[] ranges;
    private int sum;

    public RandomFromArray(int [] values, int [] weights){
        this.values = values;
        this.weights = weights;
        ranges = new int[values.length];
        System.out.println("Ranges length "+values.length);
        //sum of all ranges
        sum = 0;
        for(int weight: weights){
            sum += weight;
        }
        //fill the ranges of the left borders
        int lastSum = 0;
        for(int i = 0; i < ranges.length; i++){
            ranges[i] = lastSum;
            lastSum += weights[i];
        }
        System.out.println("Ranges array"+ Arrays.toString(ranges));


    }
    public int getRandom(){
        int random = (int)(Math.random()*(sum-1));
        System.out.println("RANDOM "+random);
        int outRangeIndex = 0;
        for(int i = 0; i < ranges.length; i++){
            if(ranges[i] > random){
                break;
            }
            outRangeIndex = i;
        }
        return values[outRangeIndex];
    }

    public static void main(String[] args) {
        int [] values = {1,2,3};
        int [] weights = {1,2,10};
        RandomFromArray rand = new RandomFromArray(values,weights);
        System.out.println("Rand is "+rand.getRandom());
    }

}
