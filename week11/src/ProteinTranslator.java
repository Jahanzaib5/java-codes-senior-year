import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProteinTranslator {

    List<String> translate(String RNASequence){
        List<String> result = new ArrayList<String>();
        StringBuilder temp = new StringBuilder();
        temp.append(RNASequence.trim());
        if (temp.length()==3){
            result.add(RNASequence);
        }else if (temp.length()<3){
            System.out.println("Error");
        }else {
            for (int i=3; i<temp.length(); i+=4){
                temp.insert(i, ',');
            }
            result = Arrays.asList(temp.toString().split(",", -1));
        }
        System.out.println(result);
        return CodonIntoProtein(result);
    }


    List<String> CodonIntoProtein(List<String> check){
        List<String> finResult= new ArrayList<String>();
        label:
        for (String each : check){
            switch (each) {
                case "AUG":
                    finResult.add("Methionine");
                    break;
                case "UUU":
                case "UUC":
                    finResult.add("Phenylalanine");
                    break;
                case "UUA":
                case "UUG":
                    finResult.add("Leucine");
                    break;
                case "UCU":
                case "UCC":
                case "UCA":
                case "UCG":
                    finResult.add("Serine");
                    break;
                case "UAU":
                case "UAC":
                    finResult.add("Tyrosine");
                    break;
                case "UGU":
                case "UGC":
                    finResult.add("Cysteine");
                    break;
                case "UGG":
                    finResult.add("Tryptophan");
                    break;
                case "UAA":
                case "UAG":
                case "UGA":
                    break label;
            }
        }
        return finResult;
    }


}


