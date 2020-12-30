import java.util.SplittableRandom;

public class PigLatinTranslator {

    public String translate(String sentence){
        String result = "";
        sentence = sentence.toLowerCase().trim();

        String[] check = sentence.split(" ", -1);
        for (String each : check){
            result += translateTheWord(each);
            result+=" ";
        }

        return result.trim();
    }

    public static String translateTheWord(String word){
        String result = "";
        if (firstWordVowel(word) && word.length()>2){
            result = result = word + "ay";
        }else {
            if (word.length()==2 && word.charAt(1)=='y'){
                result = "y" + word.charAt(0) + "ay";
            }else if (firstContainQU(word) && word.length()>2){
                result = word.substring(2) + word.substring(0,2) + "ay";
            }else if (containQU(word) && word.length()>2){
                result = word.substring(3) + word.substring(0,3) + "ay";
            }else if (word.charAt(0)=='y'){
                    result = word + "ay";
            }else if (containsY(word)){
                result = "y" + word.substring(2) + word.substring(0,2) + "ay";
            }else {
                result = word.substring(1) + word.charAt(0)  + "ay";
            }
        }

        return result;
    }

    public static boolean firstWordVowel(String word){
        char ch = word.charAt(0);
        return (ch=='a' || ch=='e' || ch=='i'  || ch=='o'  || ch=='u' );
    }

    public static boolean firstWordConsonant(String word){
        char ch = word.charAt(0);
        return !(ch=='a' || ch=='e' || ch=='i'  || ch=='o'  || ch=='u' );
    }

    public static boolean firstContainQU( String word){
        String check = word.substring(0,2);
        return check.equals("qu");
    }

    public static boolean containQU(String word){
        String check = word.substring(1,3);
        return check.equals("qu");
    }

    public static boolean containsY(String word){
        String sub = word.substring(1,3);
        boolean result = false;
        for (int i=0; i<sub.length(); i++){
            if (sub.charAt(i) == 'y') {
                result = true;
                break;
            }
        }
        return result;
    }
}
