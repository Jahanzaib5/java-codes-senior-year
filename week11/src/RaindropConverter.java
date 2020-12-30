public class RaindropConverter {

    public String converter(int num){
        String result = "";
        if (num % 3 == 0){
            result+="Pling";
        }
        if (num % 5 == 0){
            result+="Plang";
        }
        if (num % 7==0){
            result+="Plong";
        }
        return result;
    }
}
