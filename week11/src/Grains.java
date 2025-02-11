import java.math.BigInteger;

public class Grains {
    //private int num;

    public BigInteger computeNumberOfGrainsOnSquare(int num){
        if (num<0 || num > 64){
            throw new IllegalArgumentException("wrongSquareMessage");
        }
        BigInteger result = new BigInteger("1");
        BigInteger temp = result;
        //int result = 1;
        //int check = result;
        for (int i=1; i<num; i++){
            result=result.add(temp);
            temp=result;

        }

        return result;
    }

    public BigInteger computeTotalNumberOfGrainsOnBoard(){
        BigInteger result = new BigInteger("0");
        for (int i=1; i<=64; i++){
            result=result.add(computeNumberOfGrainsOnSquare(i));
        }
        return result;
    }
}
