public class ArmstrongNumbers {

    public boolean isArmstrongNumber(int input){
        boolean result = false;
        if (checkNumber(input)==input){
            result=true;
        }
        return result;
    }

    public static int checkNumber(int input){
        int result = 0;
        String sInput = String.valueOf(input);
        int power = sInput.length();
        for (int i=0; i<sInput.length(); i++){
            //int temp = sInput.charAt(i);
            result+=Math.pow(Integer.parseInt(String.valueOf(sInput.charAt(i))), power);
        }
        return result;
    }
}
