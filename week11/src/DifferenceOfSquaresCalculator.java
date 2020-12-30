import java.util.ArrayList;

public class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(int num){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int result=0;
        for (int i=1; i<=num; i++){
                temp.add(i);
        }
        for (int each : temp){
            result+=each;
        }
        return (int) Math.pow(result, 2);

    }

    public int computeSumOfSquaresTo(int num){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int result = 0;
        for (int i=1; i<=num; i++){
            temp.add((int) Math.pow(i,2));
        }
        for (int each: temp){
            result+=each;
        }

        return result;

    }

    public int computeDifferenceOfSquares(int num){
        return Math.abs(computeSquareOfSumTo(num)-computeSumOfSquaresTo(num));
    }
}
