import java.util.ArrayList;
//import Classification;

public class NaturalNumber {
    private int num;

    public NaturalNumber(int num){
        this.num=num;
    }

    public Classification getClassification() {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i=1; i< this.num; i++){
            if (num%i==0){
                temp.add(i);
            }
        }

        int sum = 0;
        for (int each : temp){
            sum+=each;
        }
        Classification result;

        if (sum==num){
            //System.out.println(Classification.valueOf("PERFECT"));
            result = Classification.valueOf("PERFECT");
        }else if (sum>num){
            //System.out.println(Classification.valueOf("ABUNDANT"));
            result = Classification.valueOf("ABUNDANT");
        }else {
            //System.out.println(Classification.valueOf("DEFICIENT"));
            result = Classification.valueOf("DEFICIENT");
        }

        return result;

    }
}
