public class IsbnVerifier {

    public boolean isValid(String isbn){
        boolean result = false;
        String check = convert(isbn);
        int sum = 0;
        int count = 10;

        var c = isbn.toUpperCase().charAt(isbn.length() - 1);
        if (check.length() == 9 && (c >='A' && c <='Z')){
            result = true;
        }else if (check.length() == 10){
            for (int i=0; i<check.length(); i++){
                sum += (Integer.parseInt(String.valueOf(check.charAt(i))) * count);
                count--;
            }

            if (sum % 11 == 0){
                result=true;
            }
        }

        return result;
    }

    public static String convert(String isbn){
        String temp = "";
        for (int i=0; i<isbn.length(); i++){
            char check = ((isbn.charAt(i)));
            if ( check >= '0' && check <= '9'){
                temp+=check;
            }
        }
        return temp;
    }
}
