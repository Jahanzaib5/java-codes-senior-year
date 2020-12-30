public class ResistorColorDuo {

    public ResistorColorDuo(){};

    public int value(String[] check){
        int count = 0;
        String result = "";
        for (String each : check){
            if (count<2){
                result+=colorCode(each);
                count++;
            }
        }

        return Integer.parseInt(result);
    }

    public int colorCode(String color) {
        String[] a = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int i;
        for (i = 0; i < 9; i++) {
            if (color.equals(a[i])) {
                return i;
            }

        }
        return i;
    }

}
