public class Acronym {
    private String sentence;

    public Acronym(String sentence){
        this.sentence=sentence;
    }

    public String get(){
        String result = "";
        String[] temp = sentence.split("[ _-]+", -1);
        for (String each : temp){
            result+=each.toUpperCase().charAt(0);
        }

        return result;
    }
}
