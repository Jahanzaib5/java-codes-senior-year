import java.util.HashMap;

public class IsogramChecker {


    public boolean isIsogram(String sentence){
        boolean result = true;

        HashMap<Character, Integer> storeHash = checkLetters(sentence);
        for (Integer i : storeHash.values()) {
            if (i != 1){
                result=false;
                break;
            }
        }
        return result;

    }

    public static HashMap<Character, Integer> checkLetters(String check){
        HashMap<Character, Integer> store = new HashMap<Character, Integer>();
        for (int i=0; i<check.length(); i++){
            Character a = check.toLowerCase().charAt(i);
            if (a>='a' && a<='z') {
                if (store.containsKey(a)) {
                    store.put(a, store.get(a)+1);
                } else {
                    store.put(a, 1);
                }
            }
        }
        //System.out.println(store);

        return store;
    }
}
