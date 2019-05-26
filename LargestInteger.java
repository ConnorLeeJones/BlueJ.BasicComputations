 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int max;
        max = integers[0];
        if (integers[1] > max){
            max = integers[1];
        }
        if (integers[2] > max){
            max = integers[2];
        }
        return max;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int max;
        max = Math.max(integers[0], integers[1]);
        max = Math.max(integers[1], integers[2]);
        return max;
    }
}
